FROM adoptopenjdk/openjdk17:alpine-slim

# Create User
RUN addgroup -S remoapp && adduser -S remoapp -G remoapp
USER remoapp:remoapp

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} collect-remo-sensor.jar
ENTRYPOINT ["java","-jar","collect-remo-sensor.jar"]