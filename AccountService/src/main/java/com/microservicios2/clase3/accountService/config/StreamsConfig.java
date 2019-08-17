package com.microservicios2.clase3.accountService.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservicios2.clase3.accountService.stream.NotificationsStreams;

@EnableBinding(NotificationsStreams.class)
public class StreamsConfig {

}
