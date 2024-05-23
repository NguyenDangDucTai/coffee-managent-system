FROM openjdk:17-oracle
COPY target classes
EXPOSE 8080
ENTRYPOINT ["java", "-cp", "target/classes", "com.kenobi.cafe.CafeManagementApplication"]