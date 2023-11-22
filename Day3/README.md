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
