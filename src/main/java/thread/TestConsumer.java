package thread;

public class TestConsumer {
    public static void main(String[] args) {
        new KafkaConsumer("test-steaming3").start();
    }
}
