FROM eclipse-temurin:17-jdk-alpine as builder
COPY target/docker-message-server-1.0.0.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/fdops-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java","-jar","target/microservices-backend-1.0.0.jar"]