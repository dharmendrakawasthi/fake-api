package com.techendear.app.domains;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private String name;
	private List<Header> headers;
	private BasicAuth auth;
	private Body body;
	
	public Request() {}

	public Request(String name, List<Header> headers, BasicAuth auth, Body body) {
		this.name = name;
		this.headers = headers;
		this.auth = auth;
		this.body = body;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Header> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}

	public BasicAuth getAuth() {
		return auth;
	}

	public void setAuth(BasicAuth auth) {
		this.auth = auth;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
}
