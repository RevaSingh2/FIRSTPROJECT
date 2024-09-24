FROM openjdk:22-oracle
COPY target/spring-boot-docker.jar .
EXPOSE 8080
ENTRYPOINT [ "java","-jar","spring-boot-docker.jar" ]