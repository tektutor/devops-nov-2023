# Day 2

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
  
## What is Docker?

## Docker vs Hypervisor

## Docker Alternatives
