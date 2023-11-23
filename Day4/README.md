![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/240c088d-9514-4889-a5cc-f013a3b70f90)# Day4

## Launching Jenkins Build Server
```
cd ~/Downloads
java -jar ./jenkins.war
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/500c931e-bf3b-4311-9d7a-18d8216b11cf)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e14bd35d-e40b-43fb-9bcb-1d1982053976)

Accessing the Jenkins Dashboard on your web browser
```
http://localhost:8080
```

If this is the first time you are starting Jenkins, then Jenkins will prompt for initial admin password
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/95a67a4b-1117-4ebf-8968-e2671d366585)

It would then ask for installing plugins
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/08ef3275-fbb5-4ec3-8d2f-b338470d417a)

Let's select "Install Suggested Plugins"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/1a036a2f-dd0f-4ad6-baa8-86f6f19a5ce2)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/86fe2348-ddaa-4dca-99d7-2410769cee62)

Then you will get the below page
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/cc49b484-9cfd-4194-b73e-b5951286de2a)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b2c2b6be-6b31-4ec8-ab37-31530ea66fe0)
Click on "Save and Continue" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/94616707-e2f7-4431-b620-e5053e3254ea)
Click on "Save and Finish" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d80ff254-846f-4755-b33f-8eb432d86265)
Click on "Start using Jenkins" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2a03d47d-4218-4be5-b825-89dcf573388d)

We need to install few additonal plugins, hence let's click on "Manage Jenkins" link on the left side of Jenkins Dashboard 
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/0fad5cac-12b6-4234-8ecf-8bbe1e704e4c)

Let's click on "Plugins"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/4d0e9eb1-fd0b-47cb-b22f-7110aa60575f)

Let's click on "Available Plugins", Search for Docker and select the checkbox
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/42802595-e509-407f-9422-e86270d18c50)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/368a1f66-f1b8-4916-9812-9a5160d35304)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9813ce32-2092-4b9a-af96-07ec8347837d)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f91f6260-707f-4614-b8ee-89d847e3dcc1)
Click on Install

Make sure the "Restart option" is select, 
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/c893d1eb-fd9c-47c2-906a-a2a65df951de)

Once the additional plugins are installed and Jenkins is restart, we get to see the below page
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2c2e4c13-f36a-4cf9-9842-b3ec1489ee01)

Let's type the login credentials and sign in
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/a30628bf-f3b6-48f1-8c89-4ceaba9d15d3)

Let's go to "Manage Jenkins --> Tools"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/98c12914-c017-42b1-bf97-3c0635265eba)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/be371467-e59b-445d-a4d7-ed2335d2bebd)

Let's add JDK configuration by clicking "Add JDK" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b68b9e2f-632d-4fc5-a7f6-599083c1faa2)

Let's uncheck the "Install JDK" checkbox to get the below screen
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/eb9fe8ff-41d9-4ca6-a9a0-aeab88a9891f)

Using your Ubuntu terminal, check the maven version to copy the JDK path
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7f61567d-5ffe-498f-8da5-ee2e83797150)
We need to paste the path in Jenkins as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5281167d-ea06-4a2c-b922-565438ff32c7)

Let us scroll down to "Maven Installations"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7444d0bd-14b9-4250-9456-16431de7525b)
Click on "Add Maven" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/916ea8ac-18e3-466c-a0a0-0a8cf4c0a2e0)
Uncheck the "Install automatically" check box
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/c20a26bf-dc02-4c76-b9f0-a43e9f8a28a9)

From your ubuntu terminal, copy the mvn home path
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/78082eb2-aed7-4b01-afbf-56d71d11a755)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5c05bd2a-98e4-4562-99da-7e44fe0d98af)

Click on "Save" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/44203be9-50cd-43c2-8afa-35f657bcd038)

Let's navigate to "Manage Jenkins --> Clouds"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2857782b-fcd3-47e8-945a-0cbc9a10f378)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2c450939-4174-406c-be3d-aa09d916c285)
Click on "New cloud"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9480899e-69e4-4fde-814b-678b68ff75fb)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2cc19341-116c-41af-bd74-dbe3964d5cda)
Click on "Create" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b3886349-929b-4a14-9d93-db905f66dfc3)

Click on "Docker cloud details"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/18e58194-8a83-4758-93a9-6bd8d93099d9)

We need to configure the Docker Service to support REST API access for remote docker clients and for third-party application like Jenkins to interact with Docker service.

Let's launch the ubuntu terminal and type the below command
```
sudo systemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/734f1981-0b84-4788-a050-29bf8f38ab99)

From the above screen, you may copy the path of docker service configuration file
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/eb0fc832-5e90-480f-95b1-b82900831bf5)

Then, let's edit the file /lib/systemd/system/docker.service as an administrator
```
sudo vim /lib/systemd/system/docker.service
```
In the above file at line number 14 we need to append the below string
```
-H tcp://0.0.0.0:4243
```
Once the above string is appended it should look as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e0e406da-8636-423f-bf39-d5be6034c0b5)

To apply the service configuration changes, we need to restart the docker service 
```
sudo systemctl daemon-reload
sudo systemctl restart docker
sudo sytemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/27fa0696-d1d8-4b3e-8ee5-60e8675867d5)

Now you may proceed with Jenkins configuration
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2bc64d11-899a-4cd4-83ee-5e790ed4ba77)

Let's test if Jenkins is able to communicate with Docker Server by clicking on "Test Connection" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/dfbb9d70-9f78-4575-bd1b-c2f04edd564e)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/8ecee7fa-bc36-4e08-be3b-a80bee973fee)

Let's click on "Docker Agent Templates"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/85037954-d1b6-4390-9dfa-b26f766d0a3b)
Click on "Add Docker Template"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e013bc89-e6c4-45e2-bbe8-190e8735061d)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f33f37cf-0506-40fe-ac15-448618f55ac1)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7bab6d71-76b8-4207-91e5-44ae4f26e6af)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d865166d-c504-4a05-afb7-24a15bb625b2)
Click on "Save" button

## What is Jenkins?
- is a build automation server
- used mainly for CI/CD Builds
- this was developed in Java by Kohsuke Kawaguchi, former employee of Sun Microsystems
- Initially it was developed as Hudson is an opensource project
- Then Oracle acquired Sun Microsystems, then part of Hudson including Kohsuke Kawaguchi had quit Oracle
  created a new branch from Hudson called Jenkins
- The other part of the Hudson team they continue to develop the product as Hudson
- There is lot common code between Hudson and Jenkins
- More than 10000 active contributors are there for Jenkins
- Many other software vendors got inspired by Jenkins similar products came out in market like Bamboo, Team City, Microsoft TFS, etc.,
- Jenkins supports CI/CD build for products built in any software stack
  
## What is Cloudbees?
- Cloudbees is the enterprise paid variant of Jenkins
- Feature wise Jenkins and Cloudbees pretty much they are same
- We get support for Cloudbees while we only get community support for Jenkins
- Cloudbees is more stable as it is a paid version
  
## Jenkins Alternatives
- Bamboo
- Team City
- Cloudbees
- Microsoft Team Foundation Server (TFS)

