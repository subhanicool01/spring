#now we are writing dockerfile
# we are using docker to convert the jar file into artifacts
# after mvn build ----> target/*jar file are there.
# these jar files to use docker build convert into docker "image"

# FROM which base image
FROM openjdk:18.0.2.1-jdk
ARG JAR_SOURCE
ENV JAR_SOURCE ${JAR_SOURCE}
ARG JAR_DEST
ENV JAR_DEST ${JAR_DEST}
RUN mkdir -p /opt/service/
WORKDIR /opt/service
COPY ["${JAR_SOURCE}", "/opt/service/spring.jar"]
RUN chmod 777 /opt/service/
EXPOSE 8752
CMD ["java", "-jar", "/opt/service/spring.jar"]
