FROM openjdk
LABEL maintainer ="abc@mail.com"
EXPOSE 8081
WORKDIR /app
COPY target/spring-boot.jar /app/spring-boot.jar
ENTRYPOINT ["java", "-jar", "spring-boot.jar"]