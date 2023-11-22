# Day3

## Installing Ansible core in Ubuntu
```
sudo apt install -y ansible-core
ansible --version
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/a9ae6e8b-fcda-475b-9b86-f74c6ce20b89)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/546440e3-ab4e-4eb4-b203-af4664e6dd2a)

## What is Configuration Management Tool?
- configuration management tools are used to automate software installation,uninstallation, update/upgrade, administrative activities on an existing machine etc.,
- Configuration management helps to automate administrative activies on any existing infrastructure irrespective OS ( Windows, Unix, Linux, Mac ), Network Switches/Routers, On premise servers, Virtual Machine, Containers, Cloud based infrastructures, etc.,
- Examples
  - Puppet, Chef, Salt/Saltstack, Ansible

## what is DSL?
- Domain Specific Langauage
- the language in which we write the automation code
- Puppet & Chef uses Ruby as the Domain Specific Language
- Ansible uses YAML as the Domain Specific Language

## Why Ansible?
- uses YAML as the automation language which is easy to pick up for a Developer/QA/DevOps engineer
- simple architecture
- ansible performs configuration management with existing tools
- the machine where Ansible is installed is called Ansible Controller Machine (Laptop/Desktop)
- the machines managed by Ansible they are called Ansible Nodes ( Unix,Mac,Linux and Windows )
- How ansible controller machine connects to Unix/Mac/Linux machines is by using SSH connection
- How ansible controller machine connects to Windows ansible nodes is by using WinRM connection
- Ansible uses FTP tools like sftp/scp to copy files from Ansible controller machine to Ansible nodes
- Ansible is developed using Python by Michael Deehan ( a former employee of Red Hat )
- Michael Deehan started a company called Ansible Inc, and developed Ansible Core as an Open source project
- Ansible is agent-less

## Lab - Preparing a Custom Ubuntu Ansible Node Docker Image
We need to create a SSH key pair for rps user in the lab machine
```
ssh-keygen
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5cbb7205-100a-444e-a6d7-a8e237eab62a)

```
cd ~/devops-nov-2023
git pull
cd Day3/ansible/CustomDockerImages/ubuntu
cp ~/.ssh/id_rsa.pub authorized_keys
docker build -t tektutor/ansible-ubuntu-node:latest .
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/dfad3fe6-01f5-4f38-9cfb-858da366118b)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/57903847-9225-4962-8d44-f9f0dc7abec9)

## Lab - Create ansible ubuntu node container using our custom docker image
Deleting existing containers
```
docker rm -f $(docker ps -aq)
```

Now you may proceed creating the container as shown below
```
docker ps -a
docker run -d --name ubuntu1 --hostname ubuntu1 -p 2001:22 -p 8001:80 tektutor/ansible-ubuntu-node:latest
docker run -d --name ubuntu2 --hostname ubuntu2 -p 2002:22 -p 8002:80 tektutor/ansible-ubuntu-node:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/98b46d29-1d0c-4991-a902-4e3827dd53e5)

## Lab - Checking the SSH connectivity to the newly created ubuntu ansible node containers
```
ssh -p 2001 root@localhost
exit
ssh -p 2002 root@localhost
exit
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d67d6151-471f-448a-a664-196b288bc2e6)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/cba2a266-b937-442b-9cc9-c28a089d4a4c)


## Lab - Ansible ping
```
cd ~/devops-nov-2023
git pull
cd Day3/ansible
ansible -i inventory all -m ping
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/73bf387f-1f3d-4f66-b876-d8f980f88ab2)


## Info - What happens when we execute Ansible ad-hoc command
<pre>
1. Ansible will fetch the SHH connection details from the inventory and connects to the ansible node via SSH
2. Ansible creates a tmp directory on the Ansible Controller Machine and similar tmp directory on the Ansible Nodes
3. Ansible then transpiles the ping.py or respective ansible module, it also embeds all the dependent python code to run the ping.py into the same ping.py ansible module on the local machine in the tmp directory
4. Ansible will then copy the transpiled ping.py from ACM tmp folder to the Ansible node tmp folder
5. Ansible then executes the ping.py on the ansible nodes, save the output 
6. Clean's up the tmp directory and gives summary of the output on the Ansible Controller Machine
</pre>

## Lab - Commonly used ansible ad-hoc commands
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible

ansible -i inventory all -m ping
ansible all -m ping
ansible all -m shell -a "uptime"
ansible all -m shell -a "hostname -i"
ansible all -m shell -a "hostname"
ansible all -m setup
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/20e11079-b5a6-463a-be60-ce3176ff1705)


## Lab - Understanding inventory groups
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible dev -m ping
ansible qa -m ping
ansible all -m ping
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/753b867a-dbec-470f-828b-bc6af6a0f6d4)


## Lab - Executing your first ansible playbook
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible-playbook ping-playbook.yml
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5086abbe-7f20-4558-8dab-de132ec8ad03)

## Lab - Installing nginx web server via Ansible playbook
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible-playbook install-nginx-playbook.yml
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/90041966-8ec9-4428-8f4c-4980f3dd51f0)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/1317edfb-ea7b-4b7e-ba5b-c600730c51d7)

## Lab - Installing nginx web server via Ansible playbook using refactored playbook
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible-playbook install-nginx-playbook-refactored.yml
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/41489d8e-e3c1-41bf-9333-09754f2a5a31)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/3f4c9d14-576b-4449-b416-467d13ddfebc)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7f34eeb4-c71e-4d00-88b8-78d09744ce9f)

## What is Ansible vault?
- Ansible supports Ansible vault to securely store and retrieve sensitive information like login credentials
- Ansible vault encrypts the data using AES 256 bit algorithm
- At runtime, ansible playbooks can securely decrypt if we supply the ansible vault password
- Ansible vault supports the below features
  - Creating vault file
  - Editing vault file
  - Encrypting already existing files
  - Decrypting Vault protected files
  - Changing vault password
  - Encrypting a string value as opposed to file

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5e211c6e-9949-460e-a6f6-95273497a2fa)


## Downloading jar file from JFrog Artifactory server using Ansible playbook retrieving credentials from Ansible protected vault file

When it prompts for vault password, type 'Rps@12345' without quotes.
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible-playbook download-jar-from-jfrog-artifactory-playbook.yml --ask-vault-pass
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/ad0f3e13-1241-4111-94f6-5f1917a3006a)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/892c47aa-04ca-408e-832a-790ce97cfef7)


## Lab - Passing extra arguments to Ansible playbook
```
cd ~/dev-nov-2023
git pull
cd Day3/ansible
ansible-playbook download-jar-from-jfrog-artifactory-playbook.yml -e greeting_msg=Testing
```
