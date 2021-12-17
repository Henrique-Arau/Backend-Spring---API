package com.Henrique.RestService.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Henrique.RestService.dto.filter.PostFilter;
import com.Henrique.RestService.dto.req.PostReq;
import com.Henrique.RestService.dto.res.PostRes;
import com.Henrique.RestService.service.PostService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping
	public Page<PostRes> index(Optional<PostFilter> filter, @PageableDefault Pageable pageable) {
		return this.postService.index(filter, pageable);
	}
	
	@GetMapping("/{setor}")
	public Optional<PostRes> show(@PathVariable Long setor) {
		return this.postService.show(setor);
	}
    
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Long store(@Valid @RequestBody PostReq dto) {
		return this.postService.store(dto);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{setor}")
	public void update(@PathVariable Long setor, @Valid @RequestBody PostReq dto) {
		this.postService.update(setor, dto);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{setor}")
	public void destroy(@PathVariable Long setor) {
		this.postService.destroy(setor);
	}
}
