package com.xav;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Student {
	public Student(int id, String name, String[] address) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.name = name;
		this.address = address;
				
	}
	@Id
	private int id;
	@Field
	private String name;
	@Field
	private String[] address;

}
