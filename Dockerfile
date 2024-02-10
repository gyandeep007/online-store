FROM openjdk:11
FROM maven
WORKDIR online-store
COPY . /online-store
RUN mvn clean install
#ADD target/online-store-0.0.1-SNAPSHOT.jar online-store-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/online-store/target/online-store-0.0.1-SNAPSHOT.jar"]
