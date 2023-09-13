package com.project.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.workshopmongo.domain.User;
import com.project.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	//É necessário que o serviço converse com o repositório para obter os dados
	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
	}
}
