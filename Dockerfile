FROM java:8
ARG JAR_FILE=target/*.jar
EXPOSE 8090
COPY ${JAR_FILE} HTA2/target/HTA-0.0.1-SNAPSHOT.jar:/hta2.jar
ENTRYPOINT ["java","-jar","/hta2.jar"]