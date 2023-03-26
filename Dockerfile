FROM openjdk:11

COPY . /myapp
WORKDIR /myapp

RUN javac  src/main/java/ru/egodev21/fdops/FdopsApplication.java
CMD ["java", "FdopsApplication.java"]