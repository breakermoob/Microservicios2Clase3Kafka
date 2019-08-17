package com.microservicios2.clase3.notificationService.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase3.notificationService.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
