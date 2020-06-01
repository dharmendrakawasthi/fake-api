package com.techendear.app.domains;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BasicAuth {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private String user;
	private String pass;
	@OneToMany(mappedBy = "auth")
	private List<Request> requests;

	public BasicAuth() {}

	public BasicAuth(String user, String pass, List<Request> requests) {
		super();
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

	public List<Request> getRequest() {
		return requests;
	}

	public void setRequest(List<Request> requests) {
		this.requests = requests;
	}
}
