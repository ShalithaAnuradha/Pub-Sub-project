package com.driftingdesk.controller;

import com.driftingdesk.dto.Email;
import com.driftingdesk.service.KafkaMessagePublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Shalitha Anuradha <shalithaanuradha123@gmail.com>
 * @since : 2023-08-01
 **/

@RestController
@RequestMapping("/producer")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;

    Logger logger = LoggerFactory.getLogger(EventController.class);

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {
        try {
            publisher.sendMessageToTopic(message);
            return ResponseEntity.ok("message published successfully ..");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @PostMapping("/publish")
    public void sendEvents(@RequestBody Email email) {
        try {
            publisher.sendEventsToTopic(email);
            logger.info("event sending status is {} ", HttpStatus.OK);
        } catch (Exception ex) {
            logger.error("error status is {} ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
