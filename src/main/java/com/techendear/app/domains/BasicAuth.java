package com.techendear.app.domains;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BasicAuth {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private String user;
	private String pass;
	@OneToOne(mappedBy = "auth")
	private Request requests;

	public BasicAuth() {}

	public BasicAuth(String user, String pass, Request requests) {
		this.user = user;
		this.pass = pass;
		this.requests = requests;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Request getRequest() {
		return requests;
	}

	public void setRequest(Request requests) {
		this.requests = requests;
	}
}
