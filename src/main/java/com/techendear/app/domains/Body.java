package com.techendear.app.domains;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Body {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	@Lob
	private byte[] body;
	
	public Body() {}

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
}
