# Base image
FROM maven:3.8.1-jdk-8

# Set the working directory
WORKDIR /app

# Copy the Maven project file(s) to the working directory
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline

# Copy the application source code to the working directory
COPY src/ ./src/

# Build the application
RUN mvn package

# Expose the application port (change it if needed)
EXPOSE 8080

# Set the entrypoint command to run the application
CMD ["java", "-jar", "target/your-application.jar"]
