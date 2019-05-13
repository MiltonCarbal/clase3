package xyz.mac.clase3;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FakerProducer {

    Faker faker = new Faker();

    public Usuario producir() {

        return new Usuario(UUID.randomUUID().toString(), faker.name().fullName(), faker.address().city(), faker.address().country());

    }
}
