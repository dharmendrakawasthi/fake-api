package com.techendear.app.domains;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "request")
	private List<Header> headers;
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "auth_id")
	private BasicAuth auth;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "request_body_id")
	private Body body;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "response_id")
	private Response response;
	
	public Request() {}

	public Request(String name, List<Header> headers, BasicAuth auth, Body body, Response response) {
		this.name = name;
		this.headers = headers;
		this.auth = auth;
		this.body = body;
		this.response = response;
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

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
}
