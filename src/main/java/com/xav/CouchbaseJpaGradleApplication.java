package com.xav;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouchbaseJpaGradleApplication {
	
	@Autowired
	private StudentRepository repo;
	
	@PostConstruct
	public void initStudentRepository(){
			repo.saveAll(Stream.
				of(new Student(100,"md",new String[]{"Devon","PA"}),
				new Student(101,"Mr",new String[]{"kop","PA"}),
				new Student(102,"Ms",new String[]{"Exton","PA"})
				)
				.collect(Collectors.toList()));
	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CouchbaseJpaGradleApplication.class, args);
	}

}
