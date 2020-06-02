package com.techendear.app.domains;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Body {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	@Lob
	private String body;
	
	@OneToOne(mappedBy = "body")
	private Request request;
	
	public Body() {}
	
	public Body(String body, Request request) {
		this.body = body;
		this.request = request;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
}
