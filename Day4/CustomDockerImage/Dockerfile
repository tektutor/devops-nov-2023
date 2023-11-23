FROM ubuntu:16.04

RUN apt update && apt install -y software-properties-common 
RUN add-apt-repository ppa:openjdk-r/ppa -y
RUN apt update && apt install -y openjdk-11-jdk
RUN apt update && apt install -y maven 
RUN apt update && apt install -y git

ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64
ENV M2_HOME /usr/share/maven
ENV PATH $JAVA_HOME/bin:$M2_HOME/bin:$PATH
