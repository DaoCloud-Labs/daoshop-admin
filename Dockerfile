FROM registry.dx.io/daocloud-dmp/vedfolnir-agent-sidecar:latest

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

ENV AGENT_OPTS="-javaagnet:/skywalking/agent/skywalking-agent.jar -javaagent:/vedfolnir/vedfolnir-agent-1.0-SNAPSHOT.jar"

WORKDIR /app
ADD target/admin-0.0.1-SNAPSHOT.jar .

EXPOSE 8002

ENTRYPOINT java $AGENT_OPTS $JAVA_OPTS -jar admin-0.0.1-SNAPSHOT.jar