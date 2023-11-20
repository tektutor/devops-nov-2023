# Day1

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
