FROM openjdk:8
ADD target/mongo-demo.jar mongo-demo.jar
EXPOSE 9000
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "mongo-demo.jar"]