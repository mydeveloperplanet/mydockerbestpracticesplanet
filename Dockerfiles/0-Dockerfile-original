FROM eclipse-temurin:17
RUN mkdir /opt/app
ARG JAR_FILE
ADD target/${JAR_FILE} /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]