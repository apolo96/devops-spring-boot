FROM maven:3.3-jdk-8 AS MAVEN_PACKAGE
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR /app
COPY --from=MAVEN_PACKAGE /build/target/gs-spring-boot-docker-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
