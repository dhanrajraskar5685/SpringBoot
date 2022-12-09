package com.example.demo.model;

public class JwsResponse {

	private String jwtToken;
	

	public JwsResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString() {
		return "JwsResponse [jwtToken=" + jwtToken + "]";
	}

}
