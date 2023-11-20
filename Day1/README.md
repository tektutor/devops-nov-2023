# Day1

## Install JDK in Ubuntu
```
sudo apt install -y default-jdk
```

Expected output
<pre>
jegan@tektutor.org:~$ sudo apt install -y default-jdk
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following additional packages will be installed:
  default-jdk-headless default-jre fonts-dejavu-extra libatk-wrapper-java libatk-wrapper-java-jni libice-dev
  libpthread-stubs0-dev libsm-dev libx11-dev libxau-dev libxcb1-dev libxdmcp-dev libxt-dev openjdk-17-jdk openjdk-17-jdk-headless
  openjdk-17-jre x11proto-dev xorg-sgml-doctools xtrans-dev
Suggested packages:
  libice-doc libsm-doc libx11-doc libxcb-doc libxt-doc openjdk-17-demo openjdk-17-source visualvm
The following NEW packages will be installed:
  default-jdk default-jdk-headless default-jre fonts-dejavu-extra libatk-wrapper-java libatk-wrapper-java-jni libice-dev
  libpthread-stubs0-dev libsm-dev libx11-dev libxau-dev libxcb1-dev libxdmcp-dev libxt-dev openjdk-17-jdk openjdk-17-jdk-headless
  openjdk-17-jre x11proto-dev xorg-sgml-doctools xtrans-dev
0 upgraded, 20 newly installed, 0 to remove and 0 not upgraded.
Need to get 77.5 MB of archives.
After this operation, 95.7 MB of additional disk space will be used.
Get:1 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 openjdk-17-jre amd64 17.0.9~6ea-1 [198 kB]
Get:2 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 default-jre amd64 2:1.17-74 [912 B]                                   
Get:3 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 openjdk-17-jdk-headless amd64 17.0.9~6ea-1 [71.2 MB]                  
Get:4 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 default-jdk-headless amd64 2:1.17-74 [954 B]                          
Get:5 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 openjdk-17-jdk amd64 17.0.9~6ea-1 [2,053 kB]                          
Get:6 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 default-jdk amd64 2:1.17-74 [914 B]                                   
Get:7 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 fonts-dejavu-extra all 2.37-8 [1,947 kB]                              
Get:8 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libatk-wrapper-java all 0.40.0-3 [54.1 kB]                            
Get:9 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libatk-wrapper-java-jni amd64 0.40.0-3 [47.2 kB]                      
Get:10 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 xorg-sgml-doctools all 1:1.11-1.1 [10.9 kB]                          
Get:11 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 x11proto-dev all 2023.2-1 [602 kB]                                   
Get:12 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libice-dev amd64 2:1.0.10-1build2 [51.4 kB]                          
Get:13 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libpthread-stubs0-dev amd64 0.4-1build2 [5,516 B]                    
Get:14 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libsm-dev amd64 2:1.2.3-1build2 [18.1 kB]                            
Get:15 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libxau-dev amd64 1:1.0.9-1build5 [9,724 B]                           
Get:16 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libxdmcp-dev amd64 1:1.1.3-0ubuntu5 [26.5 kB]                        
Get:17 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 xtrans-dev all 1.4.0-1 [68.9 kB]                                     
Get:18 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libxcb1-dev amd64 1.15-1 [85.8 kB]                                   
Get:19 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libx11-dev amd64 2:1.8.6-1ubuntu1 [731 kB]                           
Get:20 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 libxt-dev amd64 1:1.2.1-1.1 [397 kB]                                 
Fetched 77.5 MB in 19s (4,124 kB/s)                                                                                               
Selecting previously unselected package openjdk-17-jre:amd64.
(Reading database ... 177747 files and directories currently installed.)
Preparing to unpack .../00-openjdk-17-jre_17.0.9~6ea-1_amd64.deb ...
Unpacking openjdk-17-jre:amd64 (17.0.9~6ea-1) ...
Selecting previously unselected package default-jre.
Preparing to unpack .../01-default-jre_2%3a1.17-74_amd64.deb ...
Unpacking default-jre (2:1.17-74) ...
Selecting previously unselected package openjdk-17-jdk-headless:amd64.
Preparing to unpack .../02-openjdk-17-jdk-headless_17.0.9~6ea-1_amd64.deb ...
Unpacking openjdk-17-jdk-headless:amd64 (17.0.9~6ea-1) ...
Selecting previously unselected package default-jdk-headless.
Preparing to unpack .../03-default-jdk-headless_2%3a1.17-74_amd64.deb ...
Unpacking default-jdk-headless (2:1.17-74) ...
Selecting previously unselected package openjdk-17-jdk:amd64.
Preparing to unpack .../04-openjdk-17-jdk_17.0.9~6ea-1_amd64.deb ...
Unpacking openjdk-17-jdk:amd64 (17.0.9~6ea-1) ...
Selecting previously unselected package default-jdk.
Preparing to unpack .../05-default-jdk_2%3a1.17-74_amd64.deb ...
Unpacking default-jdk (2:1.17-74) ...
Selecting previously unselected package fonts-dejavu-extra.
Preparing to unpack .../06-fonts-dejavu-extra_2.37-8_all.deb ...
Unpacking fonts-dejavu-extra (2.37-8) ...
Selecting previously unselected package libatk-wrapper-java.
Preparing to unpack .../07-libatk-wrapper-java_0.40.0-3_all.deb ...
Unpacking libatk-wrapper-java (0.40.0-3) ...
Selecting previously unselected package libatk-wrapper-java-jni:amd64.
Preparing to unpack .../08-libatk-wrapper-java-jni_0.40.0-3_amd64.deb ...
Unpacking libatk-wrapper-java-jni:amd64 (0.40.0-3) ...
Selecting previously unselected package xorg-sgml-doctools.
Preparing to unpack .../09-xorg-sgml-doctools_1%3a1.11-1.1_all.deb ...
Unpacking xorg-sgml-doctools (1:1.11-1.1) ...
Selecting previously unselected package x11proto-dev.
Preparing to unpack .../10-x11proto-dev_2023.2-1_all.deb ...
Unpacking x11proto-dev (2023.2-1) ...
Selecting previously unselected package libice-dev:amd64.
Preparing to unpack .../11-libice-dev_2%3a1.0.10-1build2_amd64.deb ...
Unpacking libice-dev:amd64 (2:1.0.10-1build2) ...
Selecting previously unselected package libpthread-stubs0-dev:amd64.
Preparing to unpack .../12-libpthread-stubs0-dev_0.4-1build2_amd64.deb ...
Unpacking libpthread-stubs0-dev:amd64 (0.4-1build2) ...
Selecting previously unselected package libsm-dev:amd64.
Preparing to unpack .../13-libsm-dev_2%3a1.2.3-1build2_amd64.deb ...
Unpacking libsm-dev:amd64 (2:1.2.3-1build2) ...
Selecting previously unselected package libxau-dev:amd64.
Preparing to unpack .../14-libxau-dev_1%3a1.0.9-1build5_amd64.deb ...
Unpacking libxau-dev:amd64 (1:1.0.9-1build5) ...
Selecting previously unselected package libxdmcp-dev:amd64.
Preparing to unpack .../15-libxdmcp-dev_1%3a1.1.3-0ubuntu5_amd64.deb ...
Unpacking libxdmcp-dev:amd64 (1:1.1.3-0ubuntu5) ...
Selecting previously unselected package xtrans-dev.
Preparing to unpack .../16-xtrans-dev_1.4.0-1_all.deb ...
Unpacking xtrans-dev (1.4.0-1) ...
Selecting previously unselected package libxcb1-dev:amd64.
Preparing to unpack .../17-libxcb1-dev_1.15-1_amd64.deb ...
Unpacking libxcb1-dev:amd64 (1.15-1) ...
Selecting previously unselected package libx11-dev:amd64.
Preparing to unpack .../18-libx11-dev_2%3a1.8.6-1ubuntu1_amd64.deb ...
Unpacking libx11-dev:amd64 (2:1.8.6-1ubuntu1) ...
Selecting previously unselected package libxt-dev:amd64.
Preparing to unpack .../19-libxt-dev_1%3a1.2.1-1.1_amd64.deb ...
Unpacking libxt-dev:amd64 (1:1.2.1-1.1) ...
Setting up openjdk-17-jre:amd64 (17.0.9~6ea-1) ...
Setting up default-jre (2:1.17-74) ...
Setting up libpthread-stubs0-dev:amd64 (0.4-1build2) ...
Setting up xtrans-dev (1.4.0-1) ...
Setting up openjdk-17-jdk-headless:amd64 (17.0.9~6ea-1) ...
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jar to provide /usr/bin/jar (jar) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jarsigner to provide /usr/bin/jarsigner (jarsigner) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/javac to provide /usr/bin/javac (javac) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/javadoc to provide /usr/bin/javadoc (javadoc) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/javap to provide /usr/bin/javap (javap) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jcmd to provide /usr/bin/jcmd (jcmd) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jdb to provide /usr/bin/jdb (jdb) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jdeprscan to provide /usr/bin/jdeprscan (jdeprscan) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jdeps to provide /usr/bin/jdeps (jdeps) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jfr to provide /usr/bin/jfr (jfr) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jimage to provide /usr/bin/jimage (jimage) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jinfo to provide /usr/bin/jinfo (jinfo) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jlink to provide /usr/bin/jlink (jlink) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jmap to provide /usr/bin/jmap (jmap) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jmod to provide /usr/bin/jmod (jmod) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jps to provide /usr/bin/jps (jps) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jrunscript to provide /usr/bin/jrunscript (jrunscript) in auto mo
de
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jshell to provide /usr/bin/jshell (jshell) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jstack to provide /usr/bin/jstack (jstack) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jstat to provide /usr/bin/jstat (jstat) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jstatd to provide /usr/bin/jstatd (jstatd) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/serialver to provide /usr/bin/serialver (serialver) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jhsdb to provide /usr/bin/jhsdb (jhsdb) in auto mode
Setting up fonts-dejavu-extra (2.37-8) ...
Setting up xorg-sgml-doctools (1:1.11-1.1) ...
Setting up libatk-wrapper-java (0.40.0-3) ...
Setting up openjdk-17-jdk:amd64 (17.0.9~6ea-1) ...
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jconsole to provide /usr/bin/jconsole (jconsole) in auto mode
Setting up libatk-wrapper-java-jni:amd64 (0.40.0-3) ...
Setting up default-jdk-headless (2:1.17-74) ...
Setting up default-jdk (2:1.17-74) ...
Processing triggers for sgml-base (1.31) ...
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Setting up x11proto-dev (2023.2-1) ...
Processing triggers for fontconfig (2.14.2-4ubuntu1) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu5) ...
Setting up libxau-dev:amd64 (1:1.0.9-1build5) ...
Processing triggers for hicolor-icon-theme (0.17-2) ...
Setting up libice-dev:amd64 (2:1.0.10-1build2) ...
Processing triggers for gnome-menus (3.36.0-1.1ubuntu1) ...
Setting up libsm-dev:amd64 (2:1.2.3-1build2) ...
Processing triggers for man-db (2.11.2-3) ...
Setting up libxdmcp-dev:amd64 (1:1.1.3-0ubuntu5) ...
Setting up libxcb1-dev:amd64 (1.15-1) ...
Setting up libx11-dev:amd64 (2:1.8.6-1ubuntu1) ...
Setting up libxt-dev:amd64 (1:1.2.1-1.1) ...  
</pre>

## Checking the Apache Maven version installed on your lab machine (Ubuntu)
```
mvn --version
```

Expected output
<pre>
jegan@tektutor.org:~$ mvn --version
Apache Maven 3.8.7
Maven home: /usr/share/maven
Java version: 17.0.9-ea, vendor: Private Build, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.5.0-10-generic", arch: "amd64", family: "unix" 
</pre>

## Installing Maven in Ubuntu
```
sudo apt install -y maven
```

Expected output
<pre>
jegan@tektutor.org:~$ mvn --version
Command 'mvn' not found, but can be installed with:
sudo apt install maven
jegan@tektutor.org:~$ sudo apt install maven
[sudo] password for jegan: 
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following additional packages will be installed:
  ca-certificates-java default-jre-headless java-common libaopalliance-java
  libapache-pom-java libatinject-jsr330-api-java libcdi-api-java libcommons-cli-java
  libcommons-io-java libcommons-lang3-java libcommons-parent-java liberror-prone-java
  libgeronimo-annotation-1.3-spec-java libgeronimo-interceptor-3.0-spec-java
  libguava-java libguice-java libjansi-java libjsr305-java libmaven-parent-java
  libmaven-resolver-java libmaven-shared-utils-java libmaven3-core-java
  libplexus-cipher-java libplexus-classworlds-java libplexus-component-annotations-java
  libplexus-interpolation-java libplexus-sec-dispatcher-java libplexus-utils2-java
  libsisu-inject-java libsisu-plexus-java libslf4j-java libwagon-file-java
  libwagon-http-shaded-java libwagon-provider-api-java openjdk-17-jre-headless
Suggested packages:
  default-jre libatinject-jsr330-api-java-doc libel-api-java libcommons-io-java-doc
  libcommons-lang3-java-doc libasm-java libcglib-java libjsr305-java-doc
  libmaven-shared-utils-java-doc liblogback-java libplexus-utils2-java-doc junit4 testng
  libcommons-logging-java liblog4j1.2-java fonts-dejavu-extra fonts-ipafont-gothic
  fonts-ipafont-mincho fonts-wqy-microhei | fonts-wqy-zenhei fonts-indic
The following NEW packages will be installed:
  ca-certificates-java default-jre-headless java-common libaopalliance-java
  libapache-pom-java libatinject-jsr330-api-java libcdi-api-java libcommons-cli-java
  libcommons-io-java libcommons-lang3-java libcommons-parent-java liberror-prone-java
  libgeronimo-annotation-1.3-spec-java libgeronimo-interceptor-3.0-spec-java
  libguava-java libguice-java libjansi-java libjsr305-java libmaven-parent-java
  libmaven-resolver-java libmaven-shared-utils-java libmaven3-core-java
  libplexus-cipher-java libplexus-classworlds-java libplexus-component-annotations-java
  libplexus-interpolation-java libplexus-sec-dispatcher-java libplexus-utils2-java
  libsisu-inject-java libsisu-plexus-java libslf4j-java libwagon-file-java
  libwagon-http-shaded-java libwagon-provider-api-java maven openjdk-17-jre-headless
0 upgraded, 36 newly installed, 0 to remove and 0 not upgraded.
Need to get 57.9 MB of archives.
After this operation, 206 MB of additional disk space will be used.
Do you want to continue? [Y/n] Y
Get:1 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 ca-certificates-java all 20230710 [11.8 kB]
Get:2 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 java-common all 0.74 [6,350 B]
Get:3 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 openjdk-17-jre-headless amd64 17.0.9~6ea-1 [47.9 MB]
Get:4 http://in.archive.ubuntu.com/ubuntu mantic/main amd64 default-jre-headless amd64 2:1.17-74 [2,826 B]                        
Get:5 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libapache-pom-java all 29-2 [5,284 B]                             
Get:6 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libatinject-jsr330-api-java all 1.0+ds1-5 [5,348 B]               
Get:7 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libgeronimo-interceptor-3.0-spec-java all 1.0.1-4fakesync [8,616 B]
Get:8 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libcdi-api-java all 1.2-3 [54.3 kB]                               
Get:9 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libcommons-cli-java all 1.5.0-1 [59.3 kB]                         
Get:10 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libcommons-parent-java all 56-1 [10.7 kB]                        
Get:11 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libcommons-io-java all 2.11.0-2 [297 kB]                         
Get:12 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libcommons-lang3-java all 3.12.0-2 [532 kB]                      
Get:13 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libjsr305-java all 0.1~+svn49-11 [27.0 kB]                       
Get:14 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libguava-java all 32.0.1-1 [2,692 kB]                            
Get:15 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 liberror-prone-java all 2.18.0-1 [22.5 kB]                       
Get:16 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libgeronimo-annotation-1.3-spec-java all 1.3-1 [11.2 kB]         
Get:17 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libaopalliance-java all 20070526-7 [8,166 B]                     
Get:18 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libguice-java all 4.2.3-2 [1,434 kB]                             
Get:19 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libjansi-java all 2.4.0-2 [89.4 kB]                              
Get:20 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libmaven-parent-java all 35-1 [5,810 B]                          
Get:21 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-utils2-java all 3.4.2-1 [256 kB]                       
Get:22 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libwagon-provider-api-java all 3.5.3-1 [47.9 kB]                 
Get:23 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libmaven-resolver-java all 1.6.3-1 [544 kB]                      
Get:24 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libmaven-shared-utils-java all 3.3.4-1 [137 kB]                  
Get:25 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-cipher-java all 2.0-1 [14.7 kB]                        
Get:26 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-classworlds-java all 2.7.0-1 [50.0 kB]                 
Get:27 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-component-annotations-java all 2.1.1-1 [6,550 B]       
Get:28 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-interpolation-java all 1.26-1 [76.8 kB]                
Get:29 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libplexus-sec-dispatcher-java all 2.0-3 [28.1 kB]                
Get:30 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libslf4j-java all 1.7.32-1 [141 kB]                              
Get:31 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libsisu-inject-java all 0.3.4-2 [347 kB]                         
Get:32 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libsisu-plexus-java all 0.3.4-3 [181 kB]                         
Get:33 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libmaven3-core-java all 3.8.7-1 [1,565 kB]                       
Get:34 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libwagon-file-java all 3.5.3-1 [7,918 B]                         
Get:35 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 libwagon-http-shaded-java all 3.5.3-1 [1,332 kB]                 
Get:36 http://in.archive.ubuntu.com/ubuntu mantic/universe amd64 maven all 3.8.7-1 [18.2 kB]                                      
Fetched 57.9 MB in 20s (2,958 kB/s)                                                                                               
Extracting templates from packages: 100%
Selecting previously unselected package ca-certificates-java.
(Reading database ... 176420 files and directories currently installed.)
Preparing to unpack .../00-ca-certificates-java_20230710_all.deb ...
Unpacking ca-certificates-java (20230710) ...
Selecting previously unselected package java-common.
Preparing to unpack .../01-java-common_0.74_all.deb ...
Unpacking java-common (0.74) ...
Selecting previously unselected package openjdk-17-jre-headless:amd64.
Preparing to unpack .../02-openjdk-17-jre-headless_17.0.9~6ea-1_amd64.deb ...
Unpacking openjdk-17-jre-headless:amd64 (17.0.9~6ea-1) ...
Selecting previously unselected package default-jre-headless.
Preparing to unpack .../03-default-jre-headless_2%3a1.17-74_amd64.deb ...
Unpacking default-jre-headless (2:1.17-74) ...
Selecting previously unselected package libapache-pom-java.
Preparing to unpack .../04-libapache-pom-java_29-2_all.deb ...
Unpacking libapache-pom-java (29-2) ...
Selecting previously unselected package libatinject-jsr330-api-java.
Preparing to unpack .../05-libatinject-jsr330-api-java_1.0+ds1-5_all.deb ...
Unpacking libatinject-jsr330-api-java (1.0+ds1-5) ...
Selecting previously unselected package libgeronimo-interceptor-3.0-spec-java.
Preparing to unpack .../06-libgeronimo-interceptor-3.0-spec-java_1.0.1-4fakesync_all.deb ...
Unpacking libgeronimo-interceptor-3.0-spec-java (1.0.1-4fakesync) ...
Selecting previously unselected package libcdi-api-java.
Preparing to unpack .../07-libcdi-api-java_1.2-3_all.deb ...
Unpacking libcdi-api-java (1.2-3) ...
Selecting previously unselected package libcommons-cli-java.
Preparing to unpack .../08-libcommons-cli-java_1.5.0-1_all.deb ...
Unpacking libcommons-cli-java (1.5.0-1) ...
Selecting previously unselected package libcommons-parent-java.
Preparing to unpack .../09-libcommons-parent-java_56-1_all.deb ...
Unpacking libcommons-parent-java (56-1) ...
Selecting previously unselected package libcommons-io-java.
Preparing to unpack .../10-libcommons-io-java_2.11.0-2_all.deb ...
Unpacking libcommons-io-java (2.11.0-2) ...
Selecting previously unselected package libcommons-lang3-java.
Preparing to unpack .../11-libcommons-lang3-java_3.12.0-2_all.deb ...
Unpacking libcommons-lang3-java (3.12.0-2) ...
Selecting previously unselected package libjsr305-java.
Preparing to unpack .../12-libjsr305-java_0.1~+svn49-11_all.deb ...
Unpacking libjsr305-java (0.1~+svn49-11) ...
Selecting previously unselected package libguava-java.
Preparing to unpack .../13-libguava-java_32.0.1-1_all.deb ...
Unpacking libguava-java (32.0.1-1) ...
Selecting previously unselected package liberror-prone-java.
Preparing to unpack .../14-liberror-prone-java_2.18.0-1_all.deb ...
Unpacking liberror-prone-java (2.18.0-1) ...
Selecting previously unselected package libgeronimo-annotation-1.3-spec-java.
Preparing to unpack .../15-libgeronimo-annotation-1.3-spec-java_1.3-1_all.deb ...
Unpacking libgeronimo-annotation-1.3-spec-java (1.3-1) ...
Selecting previously unselected package libaopalliance-java.
Preparing to unpack .../16-libaopalliance-java_20070526-7_all.deb ...
Unpacking libaopalliance-java (20070526-7) ...
Selecting previously unselected package libguice-java.
Preparing to unpack .../17-libguice-java_4.2.3-2_all.deb ...
Unpacking libguice-java (4.2.3-2) ...
Selecting previously unselected package libjansi-java.
Preparing to unpack .../18-libjansi-java_2.4.0-2_all.deb ...
Unpacking libjansi-java (2.4.0-2) ...
Selecting previously unselected package libmaven-parent-java.
Preparing to unpack .../19-libmaven-parent-java_35-1_all.deb ...
Unpacking libmaven-parent-java (35-1) ...
Selecting previously unselected package libplexus-utils2-java.
Preparing to unpack .../20-libplexus-utils2-java_3.4.2-1_all.deb ...
Unpacking libplexus-utils2-java (3.4.2-1) ...
Selecting previously unselected package libwagon-provider-api-java.
Preparing to unpack .../21-libwagon-provider-api-java_3.5.3-1_all.deb ...
Unpacking libwagon-provider-api-java (3.5.3-1) ...
Selecting previously unselected package libmaven-resolver-java.
Preparing to unpack .../22-libmaven-resolver-java_1.6.3-1_all.deb ...
Unpacking libmaven-resolver-java (1.6.3-1) ...
Selecting previously unselected package libmaven-shared-utils-java.
Preparing to unpack .../23-libmaven-shared-utils-java_3.3.4-1_all.deb ...
Unpacking libmaven-shared-utils-java (3.3.4-1) ...
Selecting previously unselected package libplexus-cipher-java.
Preparing to unpack .../24-libplexus-cipher-java_2.0-1_all.deb ...
Unpacking libplexus-cipher-java (2.0-1) ...
Selecting previously unselected package libplexus-classworlds-java.
Preparing to unpack .../25-libplexus-classworlds-java_2.7.0-1_all.deb ...
Unpacking libplexus-classworlds-java (2.7.0-1) ...
Selecting previously unselected package libplexus-component-annotations-java.
Preparing to unpack .../26-libplexus-component-annotations-java_2.1.1-1_all.deb ...
Unpacking libplexus-component-annotations-java (2.1.1-1) ...
Selecting previously unselected package libplexus-interpolation-java.
Preparing to unpack .../27-libplexus-interpolation-java_1.26-1_all.deb ...
Unpacking libplexus-interpolation-java (1.26-1) ...
Selecting previously unselected package libplexus-sec-dispatcher-java.
Preparing to unpack .../28-libplexus-sec-dispatcher-java_2.0-3_all.deb ...
Unpacking libplexus-sec-dispatcher-java (2.0-3) ...
Selecting previously unselected package libslf4j-java.
Preparing to unpack .../29-libslf4j-java_1.7.32-1_all.deb ...
Unpacking libslf4j-java (1.7.32-1) ...
Selecting previously unselected package libsisu-inject-java.
Preparing to unpack .../30-libsisu-inject-java_0.3.4-2_all.deb ...
Unpacking libsisu-inject-java (0.3.4-2) ...
Selecting previously unselected package libsisu-plexus-java.
Preparing to unpack .../31-libsisu-plexus-java_0.3.4-3_all.deb ...
Unpacking libsisu-plexus-java (0.3.4-3) ...
Selecting previously unselected package libmaven3-core-java.
Preparing to unpack .../32-libmaven3-core-java_3.8.7-1_all.deb ...
Unpacking libmaven3-core-java (3.8.7-1) ...
Selecting previously unselected package libwagon-file-java.
Preparing to unpack .../33-libwagon-file-java_3.5.3-1_all.deb ...
Unpacking libwagon-file-java (3.5.3-1) ...
Selecting previously unselected package libwagon-http-shaded-java.
Preparing to unpack .../34-libwagon-http-shaded-java_3.5.3-1_all.deb ...
Unpacking libwagon-http-shaded-java (3.5.3-1) ...
Selecting previously unselected package maven.
Preparing to unpack .../35-maven_3.8.7-1_all.deb ...
Unpacking maven (3.8.7-1) ...
Setting up libslf4j-java (1.7.32-1) ...
Setting up libplexus-utils2-java (3.4.2-1) ...
Setting up libplexus-classworlds-java (2.7.0-1) ...
Setting up libjsr305-java (0.1~+svn49-11) ...
Setting up java-common (0.74) ...
Setting up libaopalliance-java (20070526-7) ...
Setting up libcommons-cli-java (1.5.0-1) ...
Setting up libplexus-component-annotations-java (2.1.1-1) ...
Setting up libgeronimo-annotation-1.3-spec-java (1.3-1) ...
Setting up libgeronimo-interceptor-3.0-spec-java (1.0.1-4fakesync) ...
Setting up libjansi-java (2.4.0-2) ...
Setting up libapache-pom-java (29-2) ...
Setting up libatinject-jsr330-api-java (1.0+ds1-5) ...
Setting up libplexus-interpolation-java (1.26-1) ...
Setting up libwagon-http-shaded-java (3.5.3-1) ...
Setting up ca-certificates-java (20230710) ...
No JRE found. Skipping Java certificates setup.
Setting up libcdi-api-java (1.2-3) ...
Setting up libwagon-provider-api-java (3.5.3-1) ...
Setting up libmaven-parent-java (35-1) ...
Setting up libcommons-parent-java (56-1) ...
Setting up libsisu-inject-java (0.3.4-2) ...
Setting up libplexus-cipher-java (2.0-1) ...
Setting up libsisu-plexus-java (0.3.4-3) ...
Setting up libcommons-lang3-java (3.12.0-2) ...
Setting up openjdk-17-jre-headless:amd64 (17.0.9~6ea-1) ...
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/java to provide /usr/bin/java (java) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/jpackage to provide /usr/bin/jpackage (jpackage) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/keytool to provide /usr/bin/keytool (keytool) in auto mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/bin/rmiregistry to provide /usr/bin/rmiregistry (rmiregistry) in auto
 mode
update-alternatives: using /usr/lib/jvm/java-17-openjdk-amd64/lib/jexec to provide /usr/bin/jexec (jexec) in auto mode
Setting up libplexus-sec-dispatcher-java (2.0-3) ...
Setting up libwagon-file-java (3.5.3-1) ...
Setting up libcommons-io-java (2.11.0-2) ...
Setting up libmaven-resolver-java (1.6.3-1) ...
Setting up libmaven-shared-utils-java (3.3.4-1) ...
Setting up libguava-java (32.0.1-1) ...
Setting up liberror-prone-java (2.18.0-1) ...
Setting up libguice-java (4.2.3-2) ...
Setting up libmaven3-core-java (3.8.7-1) ...
Processing triggers for man-db (2.11.2-3) ...
Processing triggers for ca-certificates-java (20230710) ...
Adding debian:ACCVRAIZ1.pem
Adding debian:AC_RAIZ_FNMT-RCM.pem
Adding debian:AC_RAIZ_FNMT-RCM_SERVIDORES_SEGUROS.pem
Adding debian:Actalis_Authentication_Root_CA.pem
Adding debian:AffirmTrust_Commercial.pem
Adding debian:AffirmTrust_Networking.pem
Adding debian:AffirmTrust_Premium_ECC.pem
Adding debian:AffirmTrust_Premium.pem
Adding debian:Amazon_Root_CA_1.pem
Adding debian:Amazon_Root_CA_2.pem
Adding debian:Amazon_Root_CA_3.pem
Adding debian:Amazon_Root_CA_4.pem
Adding debian:ANF_Secure_Server_Root_CA.pem
Adding debian:Atos_TrustedRoot_2011.pem
Adding debian:Autoridad_de_Certificacion_Firmaprofesional_CIF_A62634068_2.pem
Adding debian:Autoridad_de_Certificacion_Firmaprofesional_CIF_A62634068.pem
Adding debian:Baltimore_CyberTrust_Root.pem
Adding debian:Buypass_Class_2_Root_CA.pem
Adding debian:Buypass_Class_3_Root_CA.pem
Adding debian:CA_Disig_Root_R2.pem
Adding debian:Certainly_Root_E1.pem
Adding debian:Certainly_Root_R1.pem
Adding debian:Certigna.pem
Adding debian:Certigna_Root_CA.pem
Adding debian:certSIGN_Root_CA_G2.pem
Adding debian:certSIGN_ROOT_CA.pem
Adding debian:Certum_EC-384_CA.pem
Adding debian:Certum_Trusted_Network_CA_2.pem
Adding debian:Certum_Trusted_Network_CA.pem
Adding debian:Certum_Trusted_Root_CA.pem
Adding debian:CFCA_EV_ROOT.pem
Adding debian:Comodo_AAA_Services_root.pem
Adding debian:COMODO_Certification_Authority.pem
Adding debian:COMODO_ECC_Certification_Authority.pem
Adding debian:COMODO_RSA_Certification_Authority.pem
Adding debian:DigiCert_Assured_ID_Root_CA.pem
Adding debian:DigiCert_Assured_ID_Root_G2.pem
Adding debian:DigiCert_Assured_ID_Root_G3.pem
Adding debian:DigiCert_Global_Root_CA.pem
Adding debian:DigiCert_Global_Root_G2.pem
Adding debian:DigiCert_Global_Root_G3.pem
Adding debian:DigiCert_High_Assurance_EV_Root_CA.pem
Adding debian:DigiCert_TLS_ECC_P384_Root_G5.pem
Adding debian:DigiCert_TLS_RSA4096_Root_G5.pem
Adding debian:DigiCert_Trusted_Root_G4.pem
Adding debian:D-TRUST_BR_Root_CA_1_2020.pem
Adding debian:D-TRUST_EV_Root_CA_1_2020.pem
Adding debian:D-TRUST_Root_Class_3_CA_2_2009.pem
Adding debian:D-TRUST_Root_Class_3_CA_2_EV_2009.pem
Adding debian:emSign_ECC_Root_CA_-_C3.pem
Adding debian:emSign_ECC_Root_CA_-_G3.pem
Adding debian:emSign_Root_CA_-_C1.pem
Adding debian:emSign_Root_CA_-_G1.pem
Adding debian:Entrust.net_Premium_2048_Secure_Server_CA.pem
Adding debian:Entrust_Root_Certification_Authority_-_EC1.pem
Adding debian:Entrust_Root_Certification_Authority_-_G2.pem
Adding debian:Entrust_Root_Certification_Authority_-_G4.pem
Adding debian:Entrust_Root_Certification_Authority.pem
Adding debian:ePKI_Root_Certification_Authority.pem
Adding debian:e-Szigno_Root_CA_2017.pem
Adding debian:E-Tugra_Certification_Authority.pem
Adding debian:E-Tugra_Global_Root_CA_ECC_v3.pem
Adding debian:E-Tugra_Global_Root_CA_RSA_v3.pem
Adding debian:GDCA_TrustAUTH_R5_ROOT.pem
Adding debian:GlobalSign_ECC_Root_CA_-_R4.pem
Adding debian:GlobalSign_ECC_Root_CA_-_R5.pem
Adding debian:GlobalSign_Root_CA.pem
Adding debian:GlobalSign_Root_CA_-_R3.pem
Adding debian:GlobalSign_Root_CA_-_R6.pem
Adding debian:GlobalSign_Root_E46.pem
Adding debian:GlobalSign_Root_R46.pem
Adding debian:GLOBALTRUST_2020.pem
Adding debian:Go_Daddy_Class_2_CA.pem
Adding debian:Go_Daddy_Root_Certificate_Authority_-_G2.pem
Adding debian:GTS_Root_R1.pem
Adding debian:GTS_Root_R2.pem
Adding debian:GTS_Root_R3.pem
Adding debian:GTS_Root_R4.pem
Adding debian:HARICA_TLS_ECC_Root_CA_2021.pem
Adding debian:HARICA_TLS_RSA_Root_CA_2021.pem
Adding debian:Hellenic_Academic_and_Research_Institutions_ECC_RootCA_2015.pem
Adding debian:Hellenic_Academic_and_Research_Institutions_RootCA_2015.pem
Adding debian:HiPKI_Root_CA_-_G1.pem
Adding debian:Hongkong_Post_Root_CA_1.pem
Adding debian:Hongkong_Post_Root_CA_3.pem
Adding debian:IdenTrust_Commercial_Root_CA_1.pem
Adding debian:IdenTrust_Public_Sector_Root_CA_1.pem
Adding debian:ISRG_Root_X1.pem
Adding debian:ISRG_Root_X2.pem
Adding debian:Izenpe.com.pem
Adding debian:Microsec_e-Szigno_Root_CA_2009.pem
Adding debian:Microsoft_ECC_Root_Certificate_Authority_2017.pem
Adding debian:Microsoft_RSA_Root_Certificate_Authority_2017.pem
Adding debian:NAVER_Global_Root_Certification_Authority.pem
Adding debian:NetLock_Arany_=Class_Gold=_Főtanúsítvány.pem
Adding debian:OISTE_WISeKey_Global_Root_GB_CA.pem
Adding debian:OISTE_WISeKey_Global_Root_GC_CA.pem
Adding debian:QuoVadis_Root_CA_1_G3.pem
Adding debian:QuoVadis_Root_CA_2_G3.pem
Adding debian:QuoVadis_Root_CA_2.pem
Adding debian:QuoVadis_Root_CA_3_G3.pem
Adding debian:QuoVadis_Root_CA_3.pem
Adding debian:Secure_Global_CA.pem
Adding debian:SecureSign_RootCA11.pem
Adding debian:SecureTrust_CA.pem
Adding debian:Security_Communication_ECC_RootCA1.pem
Adding debian:Security_Communication_RootCA2.pem
Adding debian:Security_Communication_RootCA3.pem
Adding debian:Security_Communication_Root_CA.pem
Adding debian:SSL.com_EV_Root_Certification_Authority_ECC.pem
Adding debian:SSL.com_EV_Root_Certification_Authority_RSA_R2.pem
Adding debian:SSL.com_Root_Certification_Authority_ECC.pem
Adding debian:SSL.com_Root_Certification_Authority_RSA.pem
Adding debian:Starfield_Class_2_CA.pem
Adding debian:Starfield_Root_Certificate_Authority_-_G2.pem
Adding debian:Starfield_Services_Root_Certificate_Authority_-_G2.pem
Adding debian:SwissSign_Gold_CA_-_G2.pem
Adding debian:SwissSign_Silver_CA_-_G2.pem
Adding debian:SZAFIR_ROOT_CA2.pem
Adding debian:Telia_Root_CA_v2.pem
Adding debian:TeliaSonera_Root_CA_v1.pem
Adding debian:Trustwave_Global_Certification_Authority.pem
Adding debian:Trustwave_Global_ECC_P256_Certification_Authority.pem
Adding debian:Trustwave_Global_ECC_P384_Certification_Authority.pem
Adding debian:T-TeleSec_GlobalRoot_Class_2.pem
Adding debian:T-TeleSec_GlobalRoot_Class_3.pem
Adding debian:TUBITAK_Kamu_SM_SSL_Kok_Sertifikasi_-_Surum_1.pem
Adding debian:TunTrust_Root_CA.pem
Adding debian:TWCA_Global_Root_CA.pem
Adding debian:TWCA_Root_Certification_Authority.pem
Adding debian:UCA_Extended_Validation_Root.pem
Adding debian:UCA_Global_G2_Root.pem
Adding debian:USERTrust_ECC_Certification_Authority.pem
Adding debian:USERTrust_RSA_Certification_Authority.pem
Adding debian:vTrus_ECC_Root_CA.pem
Adding debian:vTrus_Root_CA.pem
Adding debian:XRamp_Global_CA_Root.pem
done.
Setting up maven (3.8.7-1) ...
update-alternatives: using /usr/share/maven/bin/mvn to provide /usr/bin/mvn (mvn) in auto mode
Setting up default-jre-headless (2:1.17-74) ...  
</pre>

## Checking with Maven in Ubuntu
```
mvn --version
```

Expected output
<pre>
jegan@tektutor.org:~$ mvn --version
Apache Maven 3.8.7
Maven home: /usr/share/maven
Java version: 17.0.9-ea, vendor: Private Build, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.5.0-10-generic", arch: "amd64", family: "unix" 
</pre>

## DevOps Tools
Build Tools
- CMake/Makefile - C/C++ based applications
- Ant/Maven/Gradle - Java based projects
- MSBuild - Dot Net based projects

Build Servers ( Web Servers - can be accessed over Internet via web browsers )
- detects code commites done in Version Controls
- once it detects code changes, it automatically triggers builds
- to actually compile and run test cases, it would depends on Build Tools like Make, Maven, MSBuild etc.,
- Jenkins, Cloudbees, TeamCity, Bamboo, etc.
- It is capable running maven, ant, c++ application, msbuild (.net ) application builds

Version Control Tools
- Git/GitHub, BitBucket, Perforce, etc

- Configuration Tools
  - Ansible, Puppet, Chef and Salt

- Infrastructure Automation Tools
  - Cloudformation, Terraform, etc.,

- Container Tools
  - Docker, Podman, etc.,
 
- Orchestration Tools
  - Docker SWARM
  - Kubernetes
  - OpenShift

## What is DevOps?
- end to end automation that helps detects bugs as soon as it is injected
- is an engineering process to detect bugs early before the software product goes to production
- helps in delivering our product confidently and frequently
- Dev + Ops ( Dev - Development Team + QA Team, Ops - Operations Team )

Developers - automating unit/integration testing using Test Automation Frameworks
QA - automating function/api/component/load/stress/performance/regression/smoke, etc using BDD frameworks like Cucumber, Specflow, etc
Ops 
 - automate software installation/uninstallation/software upgrades/updates
   - eg: Configuration Management Tools ( Ansible, Puppet, Chef and Salt/Saltstack )
 - infrastructure automation
   - eg: Cloudformation, Terraform


## What is Continuous Integration (CI)?
- on code-commit, automatically the modified code is pulled by Jenkins and it triggers build and runs unit/integration test cases
- shares build and test reports by email in about 30~45 minutes post the code commit automatically
- the team members would be committing code several time a day, i.e as soon as they implemented a code that is unit-testable they shoudl integrate their code with existing code by merging their changes to dev-branch

## What is Continuous Deployment (CD)?
- QA Test automation
- CI built application binaries are automatically deployed on the QA environment for further test automation 

## What is Continuous Delivery (CD)?
- The QA certified application binaries will be automatically delivered to Customer's environment or in some cases made live in production(automatically)
- optionally manual approvals could be included before the application is made live or delivered to customer's environment


## Maven Overview
- build tool
- is a build tool used mostly by Java based projects
- it is a language agnostic(independent) build tool, hence you could technically use this build tool to perform any language based projects
- it supports dependency management
- developed and maintained by Apache Foundation
- it is an opensource build tool
- actually it was developed to replace Apache Ant build tool
- Maven co-ordinates ( 3 co-ordinates )
  - GroupId ( string that represents reverse domain name of your organization )
  - ArtifactId ( string - represents the name of the jar/war/ear/zip/exe )
  - Version - ( string 1.2.3 - 1 represents Major version, 2 represents minor version, 3 represents incremental version )
  - any project has to named in terms of Maven co-ordinates
- Maven convention Over Configuration
  - 80-20 Principle
  - when maven conventions are followed with zero to minimum configurations we can create and build projects
  - when we can't follow maven conventions, we need to perform configurations

