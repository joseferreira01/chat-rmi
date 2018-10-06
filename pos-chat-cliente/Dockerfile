FROM openjdk:8u121-jre-alpine
ADD target/chat-cliente.jar chat-cliente.jar
EXPOSE 1099
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /chat-cliente.jar"]
