FROM centos:centos7
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org> 

RUN yum install -y which openssh-clients openssh-server python3 
RUN ssh-keygen -f /etc/ssh/ssh_host_rsa_key
RUN ssh-keygen -t dsa -f /etc/ssh/ssh_host_dsa_key
RUN sed -i '/pam_loginuid.so/c session    optional     pam_loginuid.so'  /etc/pam.d/sshd

RUN echo 'root:root' | chpasswd
RUN usermod -aG wheel root 

RUN mkdir -p /root/.ssh
COPY authorized_keys /root/.ssh/authorized_keys

EXPOSE 22
EXPOSE 80 

ENTRYPOINT ["/usr/sbin/sshd", "-D"]
