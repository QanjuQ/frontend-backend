FROM gradle as builder
WORKDIR /home/gradle/src
COPY --chown=gradle:gradle . ./
RUN gradle build --continuous --quiet
RUN gradle build
EXPOSE 8080

FROM openjdk:10-jre-slim
WORKDIR /app
COPY --from=builder /home/gradle/src/build/libs/backend-0.1.0.jar ./todo.jar
ENTRYPOINT ["java","-jar","todo.jar"]
