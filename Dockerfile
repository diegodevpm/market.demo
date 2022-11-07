FROM jetty:latest
WORKDIR /var/lib/jetty/idempiere/webapps
ADD /Users/dp/Downloads/idempiere-9 /idempiere-9
#CMD ["java" , "-jar", "/market.jar"]