FROM lolhens/baseimage-openjre
ADD target/springdatajpa-0.0.1-SNAPSHOT.jar springdatajpa-0.0.1-SNAPSHOT.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "springdatajpa-0.0.1-SNAPSHOT.jar"]