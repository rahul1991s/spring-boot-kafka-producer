package com.rahuls.kafka.springbootkafkaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahuls.kafka.springbootkafkaproducer.model.User;

/**
 * @author Rahul S
 *
 */
@RestController
@RequestMapping("kafka")
public class UserResource {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	//private KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "rahuls_kafka_example";

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {

		kafkaTemplate.send(TOPIC, new User(name, "Perm", 10000L));

		return "Published successfully";
	}
}
