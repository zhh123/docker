FROM carsharing/alpine-oraclejdk8-bash
VOLUME /tmp
ADD docker-demo.jar docker-demo.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar", "/docker-demo.jar"]