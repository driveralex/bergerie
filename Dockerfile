FROM jboss/wildfly:16.0.0.Final
RUN /opt/jboss/wildfly/bin/add-user.sh alex driveralex
EXPOSE 9990:9990
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]