# Derived from official openjdk
FROM openjdk:8
#Add the jar file
ADD ./target/spring-boot-mysql-hibernate-0.0.1-SNAPSHOT.jar spring-boot-mysql-hibernate-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT [ "java", "-jar", "spring-boot-mysql-hibernate-0.0.1-SNAPSHOT.jar" ]
