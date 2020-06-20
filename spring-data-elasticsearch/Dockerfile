FROM adoptopenjdk:11-jre-hotspot
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/app.jar io/groud/spring/elasticsearch/SpringElasticApplication.java"]

##
## docker build -t spring/data-elasticsearch .

## docker run -p 8080:8080 -d spring/data-elasticsearch
