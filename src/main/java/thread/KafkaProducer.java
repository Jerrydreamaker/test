package thread;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

public class KafkaProducer extends Thread {
    private final Producer<Integer, String> producer;
    private final String topic;
    private final Properties props = new Properties();
    public KafkaProducer(String topic) {
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", "localhost:9092");
        producer = new Producer<Integer, String>(new ProducerConfig(props));
        this.topic = topic;
    }
    @Override
    public void run() {
        int messageNo = 1;

        /*
        while (true) {
            String messageStr = new String("Hello World " + messageNo);
            System.out.println("Send1:" + messageStr);
            producer.send(new KeyedMessage<Integer, String>(topic, messageStr));
            messageNo++;


            try {
                sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }*/

        //for (int i=0;i<100;i++){
        int i=0;
        while (true){
            String messageStr = new String("Hello World " + i++);
            System.out.println("Send:" + messageStr);
            producer.send(new KeyedMessage<Integer, String>(topic, messageStr));
        }

        //}
    }
}

