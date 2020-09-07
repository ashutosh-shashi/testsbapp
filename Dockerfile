FROM openjdk:11-jre

ENTRYPOINT ["java", "-jar", "/usr/Shared/myservice/myservice.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/Shared/myservice/myservice.jar