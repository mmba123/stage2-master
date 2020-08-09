# example using kafka-python
import kafka


consumer = kafka.KafkaConsumer(group_id='test', bootstrap_servers=['localhost:9094'])
topics = consumer.topics()

if not topics: 
    raise RuntimeError()
