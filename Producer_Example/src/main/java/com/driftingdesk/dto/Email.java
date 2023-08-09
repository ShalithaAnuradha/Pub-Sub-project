package com.driftingdesk.dto;

import lombok.Data;

/**
 * @author : Shalitha Anuradha <shalithaanuradha123@gmail.com>
 * @since : 2023-08-01
 **/

@Data
public class Email {
    private int id;
    private String sender;
    private String receiver;
    private String subject;
    private String msgBody;
}

