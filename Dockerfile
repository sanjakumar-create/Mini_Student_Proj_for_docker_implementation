
FROM openjdk:27-ea-trixie
ADD target/student-app.jar student-app.jar

ENTRYPOINT ["java","-jar","/student-app.jar"]
