package com.Henrique.RestService.service;

import java.util.Optional;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.Henrique.RestService.dto.filter.PostFilter;
import com.Henrique.RestService.dto.req.PostReq;
import com.Henrique.RestService.dto.res.PostRes;
import com.Henrique.RestService.model.Post;
import com.Henrique.RestService.repository.PostRepository;
import com.Henrique.RestService.specs.PostSpecs;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	private Post save(Post post) {
		return this.postRepository.save(post);
	}
	
	public Page<PostRes> index(Optional<PostFilter> filter, Pageable pageable) {
		Specification<Post> spec = PostSpecs.specByFilter(filter);
		return this.postRepository.findAll(spec, (org.springframework.data.domain.Pageable) pageable).map(PostRes::new);
	}
	
	public Optional<PostRes> show(Long setor) {
		return this.postRepository.findById(setor).map(PostRes::new);
	}
	
	public Long store(PostReq dto) {
		Post post = dto.toModel(new Post());
		post = this.save(post);
		return post.getSetor();
	}
    
	public void update(Long setor, PostReq dto) {
		Post post = dto.toModel(this.postRepository.findById(setor).get());
		post = this.save(post);
	}
	
	public void destroy(Long Setor) {
		this.postRepository.deleteById(Setor);
	}
}
