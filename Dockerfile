FROM openjdk:8-jre-alpine
ARG ARTIFACT_NAME
ARG EXPOSED_PORT

ADD ${ARTIFACT_NAME}.jar /usr/share/app.jar

EXPOSE ${EXPOSED_PORT}

ENTRYPOINT exec java $JAVA_OPTS  -jar /usr/share/app.jar
