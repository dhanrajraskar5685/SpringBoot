package com.example.demo.repo;

public class ExcepationResponse {

	
	private String errorMsg;
	
	
	private String urlApi;


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	public String getUrlApi() {
		return urlApi;
	}


	public void setUrlApi(String urlApi) {
		this.urlApi = urlApi;
	}


	@Override
	public String toString() {
		return "ExcepationResponse [errorMsg=" + errorMsg + ", urlApi=" + urlApi + "]";
	}
	
	
}
