FROM openjdk:8
EXPOSE 8090
ADD target/workOrders-service-docker.jar workOrders-service-docker.jar
ENTRYPOINT ["java", "-jar","/workOrders-service-docker.jar"]