package br.com.deyvidfernandes.customer.business.object;

import br.com.deyvidfernandes.customer.controller.dto.CustomerDto;
import br.com.deyvidfernandes.customer.producer.GenericProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerBO {
    @Autowired
    GenericProducer genericProducer;
    @Value("${spring.kafka.topic.customer}")
    private String topicCustomer;

    public void create(String key, CustomerDto customerDto) {
        producer(topicCustomer, key, customerDto);
    }

    private void producer(String topic, String key, CustomerDto customer) {
        genericProducer.producer(topic, key, customer.toString());
    }
}
