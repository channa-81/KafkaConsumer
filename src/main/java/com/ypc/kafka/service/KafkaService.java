package com.ypc.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ypc.kafka.model.Course;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Data
public class KafkaService implements KafkaServiceInt{
	
	private String message;

	@Override
	@KafkaListener(topics="ypc", groupId="ypc-grp" )
	public void getMessage(Course course) {
		
		message = course + " Sucessfully got data from kafak....";
		System.out.println(message);
	}
	
	
}
