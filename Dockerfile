FROM tomcat:9.0.86-jre11

ENV JAVA_OPTS="$JAVA_OPTS -Dspring.config.location=file:/usr/local/tomcat/external-config-files/application.properties"
#ENV CLASSPATH="$CLASSPATH=/usr/local/tomcat/external-config-files"

ADD target/springboot-ext-config*.war /usr/local/tomcat/webapps/

USER 0

RUN mkdir -p /usr/local/tomcat/external-config-files

#ADD setenv.sh /usr/local/tomcat/bin/

USER $CONTAINER_USER_ID

EXPOSE 8080

CMD ["catalina.sh", "run"]