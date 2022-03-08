package com.formacionbdi.springboot.app.topics.entity;


public class Topic {
	private String dut;
	private String codigoError;
	private String tipoDut;
	
	public Topic() {
	
	}

	
	public Topic(String dut, String codigoError, String tipoDut) {
		super();
		this.dut = dut;
		this.codigoError = codigoError;
		this.tipoDut = tipoDut;
	}


	public String getDut() {
		return dut;
	}

	public void setDut(String dut) {
		this.dut = dut;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getTipoDut() {
		return tipoDut;
	}

	public void setTipoDut(String tipoDut) {
		this.tipoDut = tipoDut;
	}
	
	
	
	
}
