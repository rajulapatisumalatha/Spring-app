FROM revathismart/tomcat:ubuntu
ADD  /target/Spring-app-0.0.1-SNAPSHOT.war /apache-tomcat-9.0.37/webapps
EXPOSE 8080
CMD ["/apache-tomcat-9.0.37/bin/catalina.sh", "run"]
