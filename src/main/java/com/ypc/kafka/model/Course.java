package com.ypc.kafka.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Course {
	private String courseId;
	private String title;
	private String trainer;
	private double price;
}
