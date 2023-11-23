# Day4

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

Let us scroll down to "Maven Installation"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7444d0bd-14b9-4250-9456-16431de7525b)

