FROM openjdk:8
EXPOSE 8069
ADD target/customer-service-docker.jar customer-service-docker.jar
ENTRYPOINT ["java", "-jar","/customer-service-docker.jar"]