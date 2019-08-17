package com.microservicios2.clase3.customerService.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.microservicios2.clase3.customerService.model.Notification;
import com.microservicios2.clase3.customerService.stream.NotificationStreams;

@Service
public class NotificationService {

	private final NotificationStreams notificationStreams;
	
	public NotificationService(final NotificationStreams notificationStreams) {
		super();
		this.notificationStreams = notificationStreams;
	}
	
	public void sendNotification(final Notification notification){
		MessageChannel messageChangel = notificationStreams.notifyTo();
		messageChangel.send(MessageBuilder.withPayload(notification)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}
	
	
}
