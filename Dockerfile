FROM eclipse-temurin:17

LABEL mentainer="kallanagoudabiradar.linkedin@gmail.com"

WORKDIR /app

COPY target/rest-services-crud-0.0.1-SNAPSHOT.jar /app/rest-services-crud-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","rest-services-crud-0.0.1-SNAPSHOT.jar" ]