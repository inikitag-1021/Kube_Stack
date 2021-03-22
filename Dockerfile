FROM openjdk:8-jdk-alpine
ENV PORT 8080
EXPOSE 8080
ADD /target/*.jar /app.jar
CMD java -jar /app.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar app.jar