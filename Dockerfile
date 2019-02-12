FROM openjdk:8
ADD target/demodocker-0.0.1-SNAPSHOT.jar demodocker-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","demodocker-0.0.1-SNAPSHOT.jar"]