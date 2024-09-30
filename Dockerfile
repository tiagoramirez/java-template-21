FROM gradle:latest AS build
WORKDIR /usr/app/

COPY . .

RUN gradle build

# --
FROM openjdk:21-jdk-slim
ENV APP_HOME=/usr/app/
ENV ARTIFACT_NAME=template-0.0.1-SNAPSHOT.jar
WORKDIR $APP_HOME

COPY --from=build $APP_HOME .

EXPOSE 8080

ENTRYPOINT exec java -jar $APP_HOME/build/libs/${ARTIFACT_NAME}