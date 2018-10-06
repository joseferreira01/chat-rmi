FROM openjdk:8u121-jre-alpine
ADD target/chat-sever.jar chat-sever.jar
EXPOSE 1099
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar chat-sever.jar"]
