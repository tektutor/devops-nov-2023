# Day 2

## Processors Packaging
- Two types of Packaing
  1. Single Chip Module (SCM - One IC has one Processor )
  2. Multiple Chip Module (MCM - One IC will have multiple Processors ) 

## Server Grade Motherboards
- supports multiple Processor Sockets
- Assume the Server has 4 Processors Sockets
- Assume we are installing MCM based Processor, i.e each IC with 4 Processors
- Assumne each Processor has 256 CPU Cores
- Total CPU Cores = 16 x 256 = 4096 CPU Cores
  
## What is Hypervisor?
- virtualization technology
- allows us to run many Operating System side by side on the same laptop/desktop/workstation/server
- in other words, many OS can be active at the same time on the same machine
- its a technology that depends on Hardware & Software
- Processor Companies
  - AMD
    - Virtualization Feature supported is called AMD-V
    - any AMD processor that has AMD-V suports Virtualization
  - Intel
    - Virtualization Feature supported is VT-X
    - any Intel process that has VT-X supports Virtualization
- there are 2 types of Hypervisors
  - Type 1 ( Bare-metal Hypervisor - used in Servers and Workstations ) and
  - Type 2 ( used in Laptops/Desktops/Workstations with some Guest OS pre-installed )

- The OS that runs within the Virtual Machine is called Guest OS
- The OS on which the Hypervisor software is installed in case of Type2 is called Host OS
- Type 1 Hypervisor doesn't require Host OS
- Type 1
  Example - VMWare vCenter/vSphere
- Type 2
- Examples
  - Oracle VirtualBox (Free but not opensource )
  - VMWare
    - Fusion ( Mac OS-X )
    - Workstation ( Windows & Linux )
  - Microsoft Hyper-V
  - Parallels ( Mac OS-X )
  - Opensource KVM ( Linux )
- The OS that runs with the Virtual Machine (VMs) is a fully functional Operating System
  - it has it own dedicated Hardware resources ( CPU Cores, RAM, Storage, Network, Graphics Card, etc., )
  - Hence the number of Virtual Machines we can create on Laptop/Desktop/Workstation/Server depends on the hardware configuration of that machine
- Hypervisor is a heavy-weight technology as each VM requires dedicated hardware resources

## What is a Container Technology ?
- light-weight application virtualization technology
- container are not OS
- containers are not equivalent to Virtual Machine
- each container runs a single application
- containers does'nt have hardware resources, also they don't have OS Kernel
- every container has its own dedicated network stack
- containers also has file-system
- because containers have network stack, file system, it appears like a OS but technically they are nothing but an application process

## What is Docker?
- developed and maintained by an organization called Docker Inc
- Docker is an application virtualization container software
- Comes in 2 flavours
  - Docker Community Edition - Docker CE
  - Docker Enterprise Edition - Docker EE

## Docker vs Hypervisor
- Docker container represents one single application
- Virtual machine represents one fully functional Operating System
- container is not a OS
- containers will never be able to replace VMs or Operating System
- they are complementing technology not competing technology

## Docker Alternatives
- Podman
- Containerd
- Rkt

## What is a Container Engine ?
- high-level software that is end-user friendly
- depends on Container Runtime to manage containers
- provides easy to use commands, without knowing low-level kernel details, one can easily create and manage container via Container Engine
- Examples
  - Docker, Podman, etc.,

### What is a Container Runtime?
- Container Runtime software is the one which knows how many containers
  - creating containers
  - listing container
  - deleting containers
  - start/stop/restarting/killing/aborting containers
- low-level softwares, hence not so end-user friendly
- normally not used by end-users directly
- commonly used by Container Engine to manage containers
- Examples
  - runC is a Container Runtime used by Docker & Containerd
  - rkt is Container Runtime used by Podman

## What is a Docker Image?
- specification or blueprint of a Container
- using Docker Image we can create one or more containers
- We can create Docker Image with some software preinstalled, hence we create containers using that Docker Image, the container will have all the softwares that we preinstalled in the Docker Image
- Docker Images are maintained with Docker Registry

## What is a Docker Container?
- running instance of a Docker Image
- Docker Container get its file system and software tools from Docker Image
- Every Docker Container runs in a separate namespace
- Every Docker Container gets an IP Address
- Each Container represents one application

# Lab Exercises

## Lab - Checking the docker version
```
docker --version
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023$ docker --version
Docker version 24.0.5, build 24.0.5-0ubuntu1  
</pre>

## Lab - Listing the Docker Images from your Local Docker Registry
```
docker images
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023$ docker images
REPOSITORY                                       TAG       IMAGE ID       CREATED       SIZE
releases-docker.jfrog.io/jfrog/artifactory-oss   latest    bace876f17f4   2 weeks ago   2.2GB  
</pre>

## Lab - Listing currently running containers
```
docker ps
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023$ docker ps
CONTAINER ID   IMAGE                                                   COMMAND                  CREATED        STATUS        PORTS                                                           NAMES
99daa08c75be   releases-docker.jfrog.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   22 hours ago   Up 22 hours   0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory  
</pre>


## Lab - Downloading docker image from Docker Hub Remote Registry to Local docker registry
```
docker pull hello-world:latest
```

Expected output
<pre>
jegan@tektutor.org:~/devops-nov-2023$ docker pull hello-world:latest
latest: Pulling from library/hello-world
719385e32844: Pull complete 
Digest: sha256:c79d06dfdfd3d3eb04cafd0dc2bacab0992ebc243e083cabe208bac4dd7759e0
Status: Downloaded newer image for hello-world:latest
docker.io/library/hello-world:latest
  
jegan@tektutor.org:~/devops-nov-2023$ docker images
REPOSITORY                                       TAG       IMAGE ID       CREATED        SIZE
releases-docker.jfrog.io/jfrog/artifactory-oss   latest    bace876f17f4   2 weeks ago    2.2GB
hello-world                                      latest    9c7a54a9a43c   6 months ago   13.3kB  
</pre>
