FROM openjdk:8-jre
ENV KARAF_HOME /opt/${karaf-output-subdir}
ENV PATH $PATH:$KARAF_HOME/bin

COPY ${karaftest-output-subdir} /opt

LABEL maintainer="entwicklerteam@averbis.com"

RUN apt-get update \
    && apt-get install -y curl procps \
    && rm -rf /var/lib/apt/lists/*
WORKDIR $KARAF_HOME
EXPOSE 8101 1099 44444 8181
CMD ["./bin/karaf", "run"]