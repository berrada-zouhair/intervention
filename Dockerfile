FROM openjdk:8
ADD target/intervention-0.0.1-SNAPSHOT.jar amvt-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "amvt-backend-0.0.1-SNAPSHOT.jar"]