# Use Maven to build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app/event-service
COPY ./event-service /app/event-service
RUN mvn clean package -DskipTests

# Use a lightweight JDK image to run the application
FROM openjdk:17-jdk-slim
COPY --from=build /app/event-service/target/event-service-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
