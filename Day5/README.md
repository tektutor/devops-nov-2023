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
docker inspect jenkins_slave | grep 
```

Check if you are manually able to SSH into the container. In my case the container is 172.17.0.2, you will have to substitute your jenkins_slave container IP below
```
ssh root@172.17.0.2
```
