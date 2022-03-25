package com.studio9.rabbimq.consumer.service.implementation;

import com.studio9.rabbimq.consumer.amqp.AmqpRePublish;
import com.studio9.rabbimq.consumer.service.RePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RePublishServiceImpl implements RePublishService {
    @Autowired
    private AmqpRePublish rePublish;

    @Override
    public void repost(){
        rePublish.rePublish();
    }
}
