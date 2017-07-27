FROM openjdk:8u131-jre-alpine

COPY target/datomic_bank-0.0.1-SNAPSHOT.jar /home/datomic_bank-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "/home/datomic_bank-0.0.1-SNAPSHOT.jar"]