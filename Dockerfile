FROM 		openjdk:8-jdk-alpine
WORKDIR 	/app/
COPY 		target/sidebyside-springboot-api-0.0.1-SNAPSHOT.jar .
EXPOSE 		8080
ENTRYPOINT 	["java","-Xmx32M", "-Xms32m","-jar","sidebyside-springboot-api-0.0.1-SNAPSHOT.jar"]