FROM openjdk:8-jdk-alpine
COPY target/rest-soap-interlayer-0.0.1.jar rest-soap-interlayer-0.0.1.jar
ENTRYPOINT ["java","-jar","/rest-soap-interlayer-0.0.1.jar"]
