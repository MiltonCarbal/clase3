package xyz.mac.clase3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    FakerProducer fakerProducer;

    private final KafkaTemplate<Object, Usuario> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<Object, Usuario> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Usuario message){
        this.kafkaTemplate.send("gi", message);
        System.out.println("Sent message [" + message + "]");
    }
}
