# Stage 1: build (usa Maven o wrapper)
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY pom.xml mvnw ./
COPY .mvn .mvn
COPY src ./src
# Si quieres usar el wrapper en lugar del maven del container, uncomment:
# RUN chmod +x ./mvnw && ./mvnw -B -DskipTests package
RUN mvn -B -DskipTests package

# Stage 2: runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
ARG JAR_FILE=/workspace/target/*.jar
COPY --from=build ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
