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
	private byte[] body;
	
	@OneToOne(mappedBy = "body")
	private Request request;
	public Body() {}

	
	public Body(byte[] body, Request request) {
		this.body = body;
		this.request = request;
	}


	public Body(UUID uuid, byte[] body) {
		this.uuid = uuid;
		this.body = body;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
}
