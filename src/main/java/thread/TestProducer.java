package thread;

public class TestProducer {
    public static void main(String[] args) {
        new KafkaProducer("test").start();
        //
    }
}
