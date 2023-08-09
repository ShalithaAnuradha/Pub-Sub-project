package com.driftingdesk.consumer;

import com.driftingdesk.dto.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author : Shalitha Anuradha <shalithaanuradha123@gmail.com>
 * @since : 2023-08-01
 **/
@Service
public class KafkaMessageListner {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListner.class);

    @KafkaListener(topics = "driftingdesk-demo", groupId = "dd-group-email")
    public void consume(Email email) {
        logger.info("consumer consumes the events \n {} ", email.toString());
    }

    @KafkaListener(topics = "driftingdesk-demo1", groupId = "dd-group-msg")
    public void consume(String message) {
        logger.info("consumer consumes the events \n {} ", message);
    }
}
