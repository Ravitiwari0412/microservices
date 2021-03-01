FROM openjdk:8
EXPOSE 8085
ADD target/product-service-docker.jar product-service-docker.jar
ENTRYPOINT ["java", "-jar","/product-service-docker.jar"]