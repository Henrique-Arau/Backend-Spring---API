package com.Henrique.RestService.dto.req;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.Henrique.RestService.model.Post;

public class PostReq implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3669418270046284276L;
	@NotBlank
	private String trabalhador;
	@NotBlank
	private String cargo;
	
	public Post toModel(Post post) {
		post.setTrabalhador(trabalhador);
		post.setCargo(cargo);
		return post;
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
