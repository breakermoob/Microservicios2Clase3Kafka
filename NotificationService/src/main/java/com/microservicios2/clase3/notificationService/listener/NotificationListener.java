package com.microservicios2.clase3.notificationService.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.microservicios2.clase3.notificationService.model.Notification;
import com.microservicios2.clase3.notificationService.stream.NotificationStreams;

@Component
public class NotificationListener {

	@StreamListener(NotificationStreams.INPUT)
	public void sendMailNatification(@Payload Notification notification){
		System.out.println("Se ha enviado un email a: "+notification.getEmail()+" Mensaje: "+ notification.getMessage());
	}
	
	@StreamListener(NotificationStreams.INPUT)
	public void sendSMSNatification(@Payload Notification notification){
		System.out.println("Se ha enviado un SMS a: "+notification.getMovile()+" Mensaje: "+ notification.getMessage());
	}
	
	
}
