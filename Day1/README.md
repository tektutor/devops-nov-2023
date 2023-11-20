# Day1

## Installing Docker in Ubuntu
```
sudo apt install -y docker.io
sudo usermod -aG docker $USER
sudo su $USER
docker --version
docker images
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/a3f2e837-cac0-45eb-b8e8-bab1f14ec0d6)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/fa729e2e-bb30-4cc3-9db0-38ee22d3925e)


## Launching JFrog Artifactory Server as a Docker Container
```
docker run --name artifactory -p 8081-8082:8081-8082 -d releases-docker.jfrog.io/jfrog/artifactory-oss:latest

docker images

docker ps
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e28b8fde-0176-4666-ad88-4f59813972d4)

#### Accessing JFrog Artifactory dashboard
```
http://localhost:8081
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b4e2c891-6bc7-43df-bd03-a34751e702fa)

Default Login Credentials
<pre>
username - admin
password - password
</pre>

Once you logged in to JFrog Artifactory, it looks as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/4c3a2f8e-14dd-4548-92d0-ea3f29349505)

Click on "Get Started"

Then it prompts for changing the password, I would suggest you give Rps@12345 as the password.
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2fab005f-71c0-40e3-a6c7-f023bff9aad3)

Click "Next"

Click "Skip" for SET BASE URL

Click "Skip" for CONFIGURE DEFAULT PROXY

Click "Skip" for CREATE REPOSITORIES

Click "Finish"

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/3522bb4e-a951-42cb-9b38-beee6c64c421)

## What is DevOps?
- end to end automation that helps detects bugs as soon as it is injected
- is an engineering process to detect bugs early before the software product goes to production
- helps in delivering our product confidently and frequently
- Dev + Ops ( Dev - Development Team + QA Team, Ops - Operations Team )

Developers - automating unit/integration testing using Test Automation Frameworks
QA - automating function/api/component/load/stress/performance/regression/smoke, etc using BDD frameworks like Cucumber, Specflow, etc
Ops 
 - automate software installation/uninstallation/software upgrades/updates
   - eg: Configuration Management Tools ( Ansible, Puppet, Chef and Salt/Saltstack )
 - infrastructure automation
   - eg: Cloudformation, Terraform

## What is Continuous Integration (CI)?
- on code-commit, automatically the modified code is pulled by Jenkins and it triggers build and runs unit/integration test cases
- shares build and test reports by email in about 30~45 minutes post the code commit automatically
- the team members would be committing code several time a day, i.e as soon as they implemented a code that is unit-testable they shoudl integrate their code with existing code by merging their changes to dev-branch

## What is Continuous Deployment (CD)?
- QA Test automation
- CI built application binaries are automatically deployed on the QA environment for further test automation 

## What is Continuous Delivery (CD)?
- The QA certified application binaries will be automatically delivered to Customer's environment or in some cases made live in production(automatically)
- optionally manual approvals could be included before the application is made live or delivered to customer's environment


## Maven Overview
- build tool
- is a build tool used mostly by Java based projects
- it is a language agnostic(independent) build tool, hence you could technically use this build tool to perform any language based projects
- it supports dependency management
- developed and maintained by Apache Foundation
- it is an opensource build tool
- actually it was developed to replace Apache Ant build tool
- Maven co-ordinates ( 3 co-ordinates )
  - GroupId ( string that represents reverse domain name of your organization )
  - ArtifactId ( string - represents the name of the jar/war/ear/zip/exe )
  - Version - ( string 1.2.3 - 1 represents Major version, 2 represents minor version, 3 represents incremental version )
  - any project has to named in terms of Maven co-ordinates
- Maven convention Over Configuration
  - 80-20 Principle
  - when maven conventions are followed with zero to minimum configurations we can create and build projects
  - when we can't follow maven conventions, we need to perform configurations

# Lab Exercises

## Lab - Cloning the TekTutor Training Repository ( should be done only once )
```
cd ~
git clone https://github.com/tektutor/devops-nov-2023.git
cd devops-nov-2023
tree
```

## Lab - Compiling Maven hello project
```
cd ~/devops-nov-2023
git pull
cd Day1/hello
mvn compile
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023$ cd Day1/hello/
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ ls
pom.xml  src
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.tektutor:hello >-------------------------
[INFO] Building hello 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ hello ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-nov-2023/Day1/hello/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ hello ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-nov-2023/Day1/hello/target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.381 s
[INFO] Finished at: 2023-11-20T14:54:37+05:30
[INFO] ------------------------------------------------------------------------ 
</pre>

## Lab - Running the hello java project compiled by Maven
```
cd ~/devops-nov-2023/Day1/hello
ls
cd target/classes/
ls
tree
java org.tektutor.Hello
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ ls
pom.xml  src  target
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ cd target/classes/
jegan@tektutor.org:~/devops-nov-2023/Day1/hello/target/classes$ ls
org
jegan@tektutor.org:~/devops-nov-2023/Day1/hello/target/classes$ tree
.
└── org
    └── tektutor
        └── Hello.class

3 directories, 1 file
jegan@tektutor.org:~/devops-nov-2023/Day1/hello/target/classes$ java org.tektutor.Hello
Hello World! 
</pre>

## Lab - Deleting target and subfolders via maven
```
cd ~/devops-nov-2023
git pull
cd Day1/hello
tree
mvn clean
tree
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ ls
pom.xml  src  target
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ mvn clean
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.tektutor:hello >-------------------------
[INFO] Building hello 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hello ---
[INFO] Deleting /home/jegan/devops-nov-2023/Day1/hello/target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.078 s
[INFO] Finished at: 2023-11-20T15:04:46+05:30
[INFO] ------------------------------------------------------------------------
jegan@tektutor.org:~/devops-nov-2023/Day1/hello$ ls
pom.xml  src 
</pre>

## Lab - Packaging application binaries into a jar file for the hello maven project
```
cd ~/devops-nov-2023
git pull
cd Day1/hello
mvn package
cd target
ls
java -cp hello-1.0.0.jar org.tektutor.Hello
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/8a7baca3-dbab-453f-ae01-5bb2eecbe699)
<pre>
jegan@tektutor.org:~/devops-nov-2023/Day1/hello/target$ ls
classes  generated-sources  generated-test-sources  hello-1.0.0.jar  maven-archiver  maven-status  surefire-reports  test-classes
jegan@tektutor.org:~/devops-nov-2023/Day1/hello/target$ java -cp hello-1.0.0.jar org.tektutor.Hello
Hello World! 
</pre>

## Maven Life cycle
<pre>
- it is complex command that runs one or more life cycle phases
- Maven supports 3 life cycles ( default, clean and site )
- Maven default lifecycle supports 23 Phases
- Maven clean lifecycle supports 3 phases
- Maven site lifecycle supports 4 phases
- Each lifecycle supports one or more Phases
- Each Phase can be configured to invoke one or more Maven Plugins
- Each Maven Plugin supports one or more Goals
- Each Plugin Goal does one activity 
  - Examples
    - maven-compiler-plugin's compile goal ( compiles application source files kept under src/main/java and its subfolders )
    - maven-compiler-plugin's testCompile goal ( compiles test source files kept under src/test/java and it subfolders )
</pre>

#### Maven Default Lifecycle


Finding all the phases that are part of Maven default lifecycle
```
cd ~/devops-nov-2023
git pull
cd Day1/hello
mvn help:describe -Dcmd=compile
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/fbd9bd0d-8ab9-4061-bd78-5b2431e0cc0f)


## Lab - Installing hello application jar into Maven Local Repository
We have to be in a maven project folder to execute the maven install command as it is project specific command.

```
cd ~/devops-nov-2023
git pull
cd Day1/hello
mvn install
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/35192584-0bb0-422d-8252-cbca31ff4a8f)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/6703d1ce-66bd-4c7c-9ede-d44b74e31e35)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/0129966d-7bb5-493f-89da-99ee0904635d)


## Lab - Finding lifecycle phases of clean and site

It is not required to be inside some valid maven project to list the maven life-cycle phases.

```
cd ~/devops-nov-2023
git pull
cd Day1/hello
mvn help:describe -Dcmd=clean
mvn help:describe -Dcmd=site
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/8ab0313d-fa2c-40d5-858b-4fc51d67ae55)
