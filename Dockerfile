FROM eclipse-temurin:17 AS builder
WORKDIR /workspace
COPY gradle gradle
COPY gradlew .
COPY src src
COPY build.gradle .
COPY settings.gradle .
RUN ./gradlew clean bootWar

FROM eclipse-temurin:17
VOLUME /tmp
COPY --from=builder /workspace/build/libs/*.war app.war
ENTRYPOINT ["java", "-jar", "/app.war"]
