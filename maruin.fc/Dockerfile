
FROM openjdk:17-alpine

COPY ./target/maruin.fc-0.0.1-SNAPSHOT.jar /usr/src/maruin/

WORKDIR /usr/src/maruin

EXPOSE 8189

CMD ["java", "-jar", "maruin.fc-0.0.1-SNAPSHOT.jar"]
