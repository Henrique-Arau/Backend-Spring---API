package com.Henrique.RestService.dto.res;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.Henrique.RestService.model.Post;

public class PostRes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 651985346024059235L;
	private Long setor;
	private String trabalhador;
	private String cargo;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public PostRes() {
		
	}
	
	public PostRes(Post post) {
	    this.setor = post.getSetor();
	    this.trabalhador = post.getTrabalhador();
	    this.cargo = post.getCargo();
	    this.createdAt = post.getCreatedAt();
	    this.updatedAt = post.getUpdatedAt();
	}
	
	
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
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
