FROM eclipse-temurin:21

COPY target/nginx-spring-boot-0.0.1-SNAPSHOT.jar nginx-spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/nginx-spring-boot-0.0.1-SNAPSHOT.jar"]
