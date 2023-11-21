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
