package com.driftingdesk.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Shalitha Anuradha <shalithaanuradha123@gmail.com>
 * @since : 2023-08-01
 **/

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic createTopicForEmail() {
        return new NewTopic("driftingdesk-demo", 3, (short) 1);
    }

    @Bean
    public NewTopic createTopicForMessage() {
        return new NewTopic("driftingdesk-demo1", 3, (short) 1);
    }

//   Java configuration without yml file

//    @Bean
//    public Map<String,Object> producerConfig(){
//        Map<String,Object> props=new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
//                "localhost:9092");
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
//                StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
//                JsonSerializer.class);
//        return props;
//    }
//
//    @Bean
//    public ProducerFactory<String,Object> producerFactory(){
//        return new DefaultKafkaProducerFactory<>(producerConfig());
//    }
//
//    @Bean
//    public KafkaTemplate<String,Object> kafkaTemplate(){
//        return new KafkaTemplate<>(producerFactory());
//    }
}
