FROM openjdk:8
EXPOSE 8080 
ADD target/docker-book.jar docker-book.jar
ENTRYPOINT ["java","-jar","docker-book.jar"]