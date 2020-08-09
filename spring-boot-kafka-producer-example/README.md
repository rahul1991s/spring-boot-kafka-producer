# Spring Boot with Kafka Producer Example

-- Steps --

Start ZooKeeper
->  C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>zookeeper-server-start.bat C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\config\zookeeper.properties

Start Kafka (cluster)
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-server-start.bat C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\config\server.properties

Create Topic 
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic rahuls_kafka_example

Test- Consumer
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic rahuls_kafka_example --from-beginning

Publish message via WebService
-> http://localhost:8081/kafka/publish/rahul
