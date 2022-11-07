FROM jetty:latest
WORKDIR /var/lib/jetty/webapps
COPY build/libs/market.demo-*.jar /market.jar
CMD ["java" , "-jar", "/market.jar"]