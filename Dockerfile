FROM openjdk:22-oracle
COPY target/*.jar firstproject.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","firstproject.jar" ]