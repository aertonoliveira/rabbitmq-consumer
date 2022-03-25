package com.studio9.rabbimq.consumer.service;

import com.studio9.rabbimq.consumer.dto.MessageQueue;

public interface ConsumerService {
    void action(MessageQueue message);
}
