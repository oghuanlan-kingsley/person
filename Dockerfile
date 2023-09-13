FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Person.jar
ENTRYPOINT ["java","-jar","/Person.jar"]
EXPOSE 8080