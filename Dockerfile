FROM tomcat:9.0-jdk11-openjdk-slim
COPY target/sbweb.war /usr/local/tomcat/webapps/
