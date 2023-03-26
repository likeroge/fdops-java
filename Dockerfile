FROM openjdk:11

RUN apt-get install -y maven

COPY . /myapp
WORKDIR /myapp

RUN mvn package
#RUN javac  src/main/java/ru/egodev21/fdops/FdopsApplication.java
#CMD ["java", "FdopsApplication.java"]