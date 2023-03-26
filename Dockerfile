FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/fdops-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} fdops-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","app.jar"]