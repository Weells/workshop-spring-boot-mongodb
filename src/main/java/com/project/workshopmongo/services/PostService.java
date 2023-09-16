package com.project.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.workshopmongo.domain.Post;
import com.project.workshopmongo.repository.PostRepository;
import com.project.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	//É necessário que o serviço converse com o repositório para obter os dados
	@Autowired
	private PostRepository rep;
	
	public List<Post> findAll(){
		return rep.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
