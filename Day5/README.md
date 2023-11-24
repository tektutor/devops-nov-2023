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
