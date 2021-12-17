package com.Henrique.RestService.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Post implements Serializable {
  

	/**
	 * 
	 */
	private static final long serialVersionUID = 6946694293935832616L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long setor;
	@NotBlank
	@Column(length = 100)
	private String trabalhador;
	@NotBlank
	@Column(length = 500)
	private String cargo;
	@CreatedDate
	private LocalDateTime createdAt;
	@LastModifiedDate
	private LocalDateTime updatedAt;
	
	
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
