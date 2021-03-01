FROM openjdk:8
EXPOSE 8081
ADD target/bookings-service-docker.jar bookings-service-docker.jar
ENTRYPOINT ["java", "-jar","/bookings-service-docker.jar"]