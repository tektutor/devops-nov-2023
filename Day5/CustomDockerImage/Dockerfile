FROM ubuntu:latest
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

RUN apt-get update && apt-get install -y openssh-server python3
RUN mkdir -p /var/run/sshd
RUN echo 'root:root' | chpasswd
RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config

# SSH login fix. Otherwise user is kicked off after login
RUN sed 's@session\s*required\s*pam_loginuid.so@session optional pam_loginuid.so@g' -i /etc/pam.d/sshd

RUN mkdir -p /root/.ssh
COPY authorized_keys /root/.ssh/authorized_keys

RUN apt update && apt install -y software-properties-common 
RUN add-apt-repository ppa:openjdk-r/ppa -y
RUN apt update && apt install -y openjdk-11-jdk
RUN apt update && apt install -y maven 
RUN apt update && apt install -y git

ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64
ENV M2_HOME /usr/share/maven
ENV PATH $JAVA_HOME/bin:$M2_HOME/bin:$PATH

EXPOSE 22
EXPOSE 80 
CMD ["/usr/sbin/sshd", "-D"]
