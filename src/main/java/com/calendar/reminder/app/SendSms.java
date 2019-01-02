package com.calendar.reminder.app;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;

public class SendSms {

    private final AmazonSNSClient _snsClient;
    private final Map<String, MessageAttributeValue> _smsAttributes;

    public SendSms() {
        _snsClient = new AmazonSNSClient(new ProfileCredentialsProvider());
        _snsClient.setRegion(Region.getRegion(Regions.EU_WEST_1));
        _smsAttributes = new HashMap<>();
    }
    
    public void send(String message) {
        _snsClient.publish(new PublishRequest()
            .withMessage(message)
            .withTopicArn("arn:aws:sns:eu-west-1:925011967189:reminder")
            .withMessageAttributes(_smsAttributes));
    }

}
