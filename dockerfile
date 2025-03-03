# Use an official OpenJDK image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code (if compiling inside the container)
COPY . .

# Compile the Java file (if using source code)
RUN javac calculator.java

# Run the application
CMD ["java", "calculator"]
