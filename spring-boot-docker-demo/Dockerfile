FROM openjdk:17-oracle
EXPOSE 8080
ADD target/spring-doc.jar spring-doc.jar
ENTRYPOINT [ "java","-jar","/spring-doc.jar" ]    