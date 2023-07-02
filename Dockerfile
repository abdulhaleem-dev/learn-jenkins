FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/demo-0.1.jar 
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]