package com.rahuls.kafka.springbootkafkaproducer.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.rahuls.kafka.springbootkafkaproducer.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rahul S
 *
 */
@Configuration
public class KakfaConfiguration {

	@Bean
	public ProducerFactory<String, User> producerFactory() {
		Map<String, Object> config = new HashMap<>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"); //  local machine which kafka is running // can configure if its outside
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<>(config);
	}


	@Bean
	public KafkaTemplate<String, User> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}


}
