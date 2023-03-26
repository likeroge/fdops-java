FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:8-jre-alpine
WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/fdops-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "fdops-0.0.1-SNAPSHOT.jar"]
#FROM adoptopenjdk/openjdk11:alpine-jre
#ARG JAR_FILE=target/fdops-0.0.1-SNAPSHOT.jar
#ARG JAR_FILE=target/*.jar
#WORKDIR /opt/app
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","app.jar"]