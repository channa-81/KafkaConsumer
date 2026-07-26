package com.ypc.kafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ypc.kafka.service.KafkaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
	private final KafkaService kafkaService;
	
	@GetMapping("/getCourse")
	@ResponseBody
	public ResponseEntity<String> getCourse(){
		String response = kafkaService.getMessage();
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
