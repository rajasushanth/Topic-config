package com.starkinc.ctopic.topicconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TopicConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicConfigApplication.class, args);
	}
}
