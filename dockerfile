# Use OpenJDK base image
FROM openjdk:21-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy built jar file into container
ARG JAR_FILE=target/monster_csv_generator-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]