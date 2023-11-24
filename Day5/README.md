# Day5
## Lab - Creating a Custom Docker Image to use as a Jenkins Slave Node

In this exercise, we will learn how to manually add a Jenkins node as Jenkins Slave Node. The Slave machine must have the following tools
- JDK
- Maven
- SSH Server
- Public Key of the user in which Jenkins built-in(master) node is running
- Private key of the user in which Jenkins build-in(master) node is running

Let's first build the custom docker image
```
cd ~/devops-nov-2023
git pull
cd Day5/CustomDockerImage
cp ~/.ssh/id_rsa.pub authorized_keys
docker build -t tektutor/maven-with-ssh:latest .
docker images
```

Let's create one container using the above custom image
```
docker run -d --name jenkins_slave --hostname jenkins_slave tektutor/maven-with-ssh:latest
docker ps
```

Find the IP address of the container
```
docker inspect jenkins_slave | grep IPA
```

Check if you are manually able to SSH into the container. In my case the container is 172.17.0.2, you will have to substitute your jenkins_slave container IP below
```
ssh root@172.17.0.2
```

## Lab - Adding Jenkins Slave Node

Navigate to Jenkins Dashboard
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7431c161-f816-4437-930b-882e58d25042)

Navigate to Manage Jenkins
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/575b7e0b-3f43-4d78-8ed5-805d9bdbd2d9)

Select Nodes
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/6607dbd6-4aa5-477d-9e88-2a3e5cf4dcaa)

Click on "New Node"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/bc7a0ca2-fda2-4a19-acba-1444ddfff4eb)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/91eb23a6-700f-438b-b10f-fd2912eba383)

Click on "Create" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/6bfb6c1c-c669-4981-8083-c82eabdd82ca)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d1c1c26a-f8ac-4ecd-89f2-3479980863f5)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/258b816c-5400-42a6-b5dd-2466cfa38bef)

We need to Add Private key as Credential, hence click on "Add" button on the Credentials
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/4aed5f6d-09f9-4905-829a-a7bd37334ab8)

Select "Jenkins"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/14d0e346-97c4-42bc-9ea9-aa0582eebe23)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/765561c7-80ff-4aef-b7b0-ee222ad0b568)

Select "Enter directly" and click on "Add"

Display the private key on your machine
```
cat ~/.ssh/id_rsa
```
Copy the private key from your RPS Lab machine as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/1ff48c80-4972-4d9d-a2ee-ef09974c54b1)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/51d89c85-a805-471d-b934-f21ea3283c38)

Click on "Add" button to save the private key credentials.
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/54699bf1-314c-411c-9071-d90f8807b313)

Select the Credential you just now added from the Combo box
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9203d92f-c7ed-478a-a33c-f122f2006587)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/65d22c68-1642-48c7-9beb-dab62202620d)

Under "Host key verification strategy" select "Non verifying Verification Strategy"

Click on "Save" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/0fe5c496-bdcc-4ec1-8787-bea2c9269fa9)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b2ee1615-b739-48b1-974e-e60f0f766199)


## Lab - Creating declarative Pipeline using Jenkinsfile
In the Manage Jenkins --> Clouds --> docker-slave update the docker image to "tektutor/maven-with-ssh:latest" and save.

Navigate to Jenkins Dashboard
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f1c9f1fa-0045-42c2-a92c-cdc72ffa5b33)

Click on "New item"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2d1b406b-6a9a-4fe2-8c0b-c70331472f17)
Select Pipeline and give a name for your Pipeline as "Delcarative_pipeline_demo"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9525718a-1169-41c5-bf16-6fac51c6f8d0)
Click on "Ok" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5f1fd9bb-aa8d-4681-adb5-ba965a52ca1d)

Build Triggers
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e80ab437-4752-488b-8bd6-67f2c1ea24c7)

Pipeline
Under Definition, select "Pipeline script from SCM" option in the combo box
Under SCM, select "Git"
In the Repository URL paste this url "https://github.com/tektutor/devops-nov-2023.git"
Change Branch Specifier from "*/master" to "*/main" without quotes
Under Script Path you need to provide relative Path for the Jenkinsfile
"Day5/DeclarativePipeline/Jenkinsfile"

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/0c19e2e1-6763-46c7-b035-73ad6d83e466)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/028002a3-b975-48c3-af4c-9d2cba38965b)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d0eb65c9-209d-4866-92fd-ff2bf33592ca)

Finally click on "Save" button and wait for the Jenkins to trigger the pipeline automatically.

## Lab - Setting up CI for mysql db changes using Datical liquibase

Let's create a mysql db container
```
docker run -d --name mysql --hostname mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
```
Expected output
<pre>
jegan@tektutor:~/devops-june-2023/Day5/datical/db-ci$ docker run -d --name mysql --hostname mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
2d1d256a3e00104d7410d8f13ff09c8261307fdda6bf3961d18dc64a9e3565b6
</pre>


You may now check if the mysql db container is running
```
docker ps
```

Expected output
<pre>
jegan@tektutor:~/devops-june-2023/Day5/datical/db-ci$ docker ps
CONTAINER ID   IMAGE          COMMAND                  CREATED         STATUS         PORTS                                                  NAMES
2d1d256a3e00   mysql:latest   "docker-entrypoint.s…"   2 minutes ago   Up 2 minutes   0.0.0.0:3306->3306/tcp, :::3306->3306/tcp, 33060/tcp   mysql
</pre>


Let us get inside the mysql db container, when prompts for password type 'root@123' without quotes
```
docker exec -it mysql bash
mysql -u root -p
CREATE DATABASE tektutor;
SHOW DATABASE;
```
Expected output
<pre>
jegan@tektutor:~/devops-june-2023/Day5/datical/db-ci$ docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE tektutor;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| tektutor           |
+--------------------+
5 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

Let's check the datical liquibase now

```
cd ~/devops-nov-2023
git pull

cd Day5/datical/db-ci
cat liquibase.properties
```

The liquibase.properties file has the mysql connection details and it looks as shown below
<pre>
jegan@tektutor:~/devops-nov-2023/Day5/datical/db-ci$ <b>cat liquibase.properties</b>
changeLogFile: dbchangelog.xml
url: jdbc:mysql://localhost:3306/tektutor
username: root
password: root@123
</pre>

Any schema changes that we wish to perform, we need to do only via the dbchangelog.xml file. For instance, to create a trainig table with 3 colums, we may create a dbchangelog.xml as shown below
```
<?xml version="1.0" encoding="UTF-8"?>  
<databaseChangeLog
    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:ext="http://www.liquibase.org/xml/ns/dbchangelog-ext"
    xmlns:pro="http://www.liquibase.org/xml/ns/pro"
    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-latest.xsd
        http://www.liquibase.org/xml/ns/dbchangelog-ext http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-ext.xsd
        http://www.liquibase.org/xml/ns/pro http://www.liquibase.org/xml/ns/pro/liquibase-pro-latest.xsd">
        
     <changeSet  id="1"  author="Jeganathan Swaminathan">  
         <createTable  tableName="training">  
             <column  name="id"  type="int">  
                 <constraints  primaryKey="true"  nullable="false"/>  
             </column>  
             <column  name="name"  type="varchar(200)">  
                 <constraints  nullable="false"/>  
             </column>  
             <column  name="duration"  type="varchar(200)"/>  
         </createTable>  
    </changeSet>  
</databaseChangeLog>
```

In order to apply the table schema changes, you may run the below command
```
cd ~/devops-nov-2023/Day5/datical/db-ci

mvn liquibase:update
```
Expected output
<pre>
jegan@tektutor:~/devops-nov-2023/Day5/datical/db-ci$ mvn liquibase:update
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.tektutor:tektutor-java-app >-------------------
[INFO] Building tektutor-java-app 1.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- liquibase-maven-plugin:4.22.0:update (default-cli) @ tektutor-java-app ---
[INFO] ------------------------------------------------------------------------
[INFO] there are no resolved artifacts for the Maven project.
[INFO] there are no resolved artifacts for the Maven project.
[INFO] Parsing Liquibase Properties File
[INFO]   File: liquibase.properties
[INFO] ------------------------------------------------------------------------
[INFO] ####################################################
##   _     _             _ _                      ##
##  | |   (_)           (_) |                     ##
##  | |    _  __ _ _   _ _| |__   __ _ ___  ___   ##
##  | |   | |/ _` | | | | | '_ \ / _` / __|/ _ \  ##
##  | |___| | (_| | |_| | | |_) | (_| \__ \  __/  ##
##  \_____/_|\__, |\__,_|_|_.__/ \__,_|___/\___|  ##
##              | |                               ##
##              |_|                               ##
##                                                ## 
##  Get documentation at docs.liquibase.com       ##
##  Get certified courses at learn.liquibase.com  ## 
##                                                ##
####################################################
Starting Liquibase at 15:53:32 (version 4.22.0 #9559 built at 2023-05-10 20:45+0000)
[INFO] Parsing Liquibase Properties File liquibase.properties for changeLog parameters
[INFO] Executing on Database: jdbc:mysql://localhost:3306/tektutor
[INFO] Successfully acquired change log lock
[INFO] Creating database history table with name: DATABASECHANGELOG
[INFO] Reading from DATABASECHANGELOG
[INFO] Using deploymentId: 6306214275
[INFO] Reading from DATABASECHANGELOG
Running Changeset: dbchangelog.xml::1::Jeganathan Swaminathan
[INFO] Table training created
[INFO] ChangeSet dbchangelog.xml::1::Jeganathan Swaminathan ran successfully in 25ms
[INFO] UPDATE SUMMARY
[INFO] Run:                          1
[INFO] Previously run:               0
[INFO] Filtered out:                 0
[INFO] -------------------------------
[INFO] Total change sets:            1


UPDATE SUMMARY
Run:                          1
Previously run:               0
Filtered out:                 0
-------------------------------
Total change sets:            1

[INFO] Update summary generated
[INFO] Update command completed successfully.
Liquibase: Update has been successful.
[INFO] Successfully released change log lock
[INFO] Successfully released change log lock
[INFO] Command execution complete
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.046 s
[INFO] Finished at: 2023-06-09T15:53:34+05:30
[INFO] ------------------------------------------------------------------------
</pre>

The liquibase will grab the mysql connection details from the liquibase.properties file and connects to our tektutor database with mysql server and applies the changeset defined in the dbchangelog.xml file.

The pom.xml file points to the liquibase.properites and the liquibase.properites file points to dbchangelog.xml file. This is how, liquibase learns about these files.

You may now verify, if the changes are done in your mysql server
<pre>
jegan@tektutor:~/devops-nov-2023/Day5/datical/db-ci$ docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> USE tektutor;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> SHOW TABLES;
+-----------------------+
| Tables_in_tektutor    |
+-----------------------+
| DATABASECHANGELOG     |
| DATABASECHANGELOGLOCK |
| training              |
+-----------------------+
3 rows in set (0.01 sec)

mysql> DESCRIBE training;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| id       | int          | NO   | PRI | NULL    |       |
| name     | varchar(200) | NO   |     | NULL    |       |
| duration | varchar(200) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

Assuming, you wish to add 2 more columns to the training table on tektutor database. We can update the dbchangelog.xml file as shown below
```
<?xml version="1.0" encoding="UTF-8"?>  
<databaseChangeLog
    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:ext="http://www.liquibase.org/xml/ns/dbchangelog-ext"
    xmlns:pro="http://www.liquibase.org/xml/ns/pro"
    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-latest.xsd
        http://www.liquibase.org/xml/ns/dbchangelog-ext http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-ext.xsd
        http://www.liquibase.org/xml/ns/pro http://www.liquibase.org/xml/ns/pro/liquibase-pro-latest.xsd">

     <changeSet  id="1"  author="Jeganathan Swaminathan">  
         <createTable  tableName="training">  
             <column  name="id"  type="int">  
                 <constraints  primaryKey="true"  nullable="false"/>  
             </column>  
             <column  name="name"  type="varchar(200)">  
                 <constraints  nullable="false"/>  
             </column>  
             <column  name="duration"  type="varchar(200)"/>  
         </createTable>  
    </changeSet>  
    <changeSet  id="2"  author="Jeganathan Swaminathan">  
         <addColumn tableName="training">  
             <column  name="from_date"  type="varchar(200)"/>  
             <column  name="to_date"  type="varchar(200)"/>  
	 </addColumn>
    </changeSet>  
</databaseChangeLog>
```

You may now update the liquibase as shown below
```
cd ~/devops-nov-2023/Day5/datical/db-ci
mvn liquibase:update
```

Expected output
<pre>
jegan@tektutor:~/devops-nov-2023/Day5/datical/db-ci$ mvn liquibase:update
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.tektutor:tektutor-java-app >-------------------
[INFO] Building tektutor-java-app 1.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- liquibase-maven-plugin:4.22.0:update (default-cli) @ tektutor-java-app ---
[INFO] ------------------------------------------------------------------------
[INFO] there are no resolved artifacts for the Maven project.
[INFO] there are no resolved artifacts for the Maven project.
[INFO] Parsing Liquibase Properties File
[INFO]   File: liquibase.properties
[INFO] ------------------------------------------------------------------------
[INFO] ####################################################
##   _     _             _ _                      ##
##  | |   (_)           (_) |                     ##
##  | |    _  __ _ _   _ _| |__   __ _ ___  ___   ##
##  | |   | |/ _` | | | | | '_ \ / _` / __|/ _ \  ##
##  | |___| | (_| | |_| | | |_) | (_| \__ \  __/  ##
##  \_____/_|\__, |\__,_|_|_.__/ \__,_|___/\___|  ##
##              | |                               ##
##              |_|                               ##
##                                                ## 
##  Get documentation at docs.liquibase.com       ##
##  Get certified courses at learn.liquibase.com  ## 
##                                                ##
####################################################
Starting Liquibase at 15:55:46 (version 4.22.0 #9559 built at 2023-05-10 20:45+0000)
[INFO] Parsing Liquibase Properties File liquibase.properties for changeLog parameters
[INFO] Executing on Database: jdbc:mysql://localhost:3306/tektutor
[INFO] Successfully acquired change log lock
[INFO] Reading from DATABASECHANGELOG
[INFO] Using deploymentId: 6306347311
[INFO] Reading from DATABASECHANGELOG
Running Changeset: dbchangelog.xml::2::Jeganathan Swaminathan
[INFO] Columns from_date(varchar(200)),to_date(varchar(200)) added to training
[INFO] ChangeSet dbchangelog.xml::2::Jeganathan Swaminathan ran successfully in 29ms
[INFO] UPDATE SUMMARY
[INFO] Run:                          1
[INFO] Previously run:               1
[INFO] Filtered out:                 0
[INFO] -------------------------------
[INFO] Total change sets:            2


UPDATE SUMMARY
Run:                          1
Previously run:               1
Filtered out:                 0
-------------------------------
Total change sets:            2

[INFO] Update summary generated
[INFO] Update command completed successfully.
Liquibase: Update has been successful.
[INFO] Successfully released change log lock
[INFO] Successfully released change log lock
[INFO] Command execution complete
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.912 s
[INFO] Finished at: 2023-06-09T15:55:47+05:30
[INFO] ------------------------------------------------------------------------
</pre>

You may now verify if the schema changes are applied
<pre>
jegan@tektutor:~/devops-nov-2023/Day5/datical/db-ci$ docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 12
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> USE tektutor;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> SHOW TABLES;
+-----------------------+
| Tables_in_tektutor    |
+-----------------------+
| DATABASECHANGELOG     |
| DATABASECHANGELOGLOCK |
| training              |
+-----------------------+
3 rows in set (0.01 sec)

mysql> DESCRIBE training;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| id        | int          | NO   | PRI | NULL    |       |
| name      | varchar(200) | NO   |     | NULL    |       |
| duration  | varchar(200) | YES  |     | NULL    |       |
| from_date | varchar(200) | YES  |     | NULL    |       |
| to_date   | varchar(200) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

For official documentation about liquibase, you may check here
https://docs.liquibase.com/faq.html
