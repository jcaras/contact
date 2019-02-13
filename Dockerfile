FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD ${JAR_FILE} contact-api.jar
ENTRYPOINT ["java","-jar","contact-api.jar"]