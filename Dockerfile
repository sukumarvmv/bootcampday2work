FROM openjdk:8-jdk-alpine

EXPOSE 8383

ARG JAR_FILE=target/cicd-pipeline-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creating docker image"

MAINTAINER "sukumarvommina1@gmail.com"

ENTRYPOINT ["java" , "-jar", "app.jar"]

