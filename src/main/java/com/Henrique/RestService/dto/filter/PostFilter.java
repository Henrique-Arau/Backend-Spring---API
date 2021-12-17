package com.Henrique.RestService.dto.filter;

import java.io.Serializable;

public class PostFilter implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -4519784271121546868L;
	private Long setor;
	private String trabalhador;
	private String cargo;
	
	public Long getSetor() {
		return setor;
	}
	public void setSetor(Long setor) {
		this.setor = setor;
	}
	public String getTrabalhador() {
		return trabalhador;
	}
	public void setTrabalhador(String trabalhador) {
		this.trabalhador = trabalhador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
	
	

