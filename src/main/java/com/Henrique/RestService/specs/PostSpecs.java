package com.Henrique.RestService.specs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.Henrique.RestService.dto.filter.PostFilter;
import com.Henrique.RestService.model.Post;
import com.Henrique.RestService.model.Post_;

public abstract class PostSpecs extends BaseSpecs {
	
	
	public static Specification<Post> specByFilter(Optional<PostFilter> filter) {
		return filter.isEmpty() ? null: (root, query, builder) -> {
			Collection<Predicate> predicates = new ArrayList<>();
			predicates.add(equal(builder, root.get(Post_.SETOR), filter.map(PostFilter::getSetor), builder));
			predicates.add(contains(builder, root.get(Post_.TRABALHADOR), filter.map(PostFilter::getTrabalhador)));
			predicates.add(contains(builder, root.get(Post_.CARGO), filter.map(PostFilter::getCargo)));
			
			@SuppressWarnings("unused")
			Expression<String> allCols = concatAll(builder, root.get(Post_.SETOR), root.get(Post_.TRABALHADOR), root.get(Post_.CARGO));
			
			
			return toAndArray(builder, predicates, predicates);
		   	
		};
			
   }

}
