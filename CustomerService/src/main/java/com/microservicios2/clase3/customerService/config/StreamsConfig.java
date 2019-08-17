package com.microservicios2.clase3.customerService.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase3.customerService.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
