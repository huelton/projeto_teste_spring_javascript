package com.br.projeto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.br.projeto.model.User;

@Service
public class UserService {

	private List<User> users;
	
	public List<User> findByUserNameOrEmail(String userName) {
		
		List<User> result = users.stream()
				.filter(x -> x.getUserName().equalsIgnoreCase(userName))
				.collect(Collectors.toList());
		
		return result;
	}
	
	  // Init some users for testing
    @PostConstruct
    private void iniDataForTesting() {

        users = new ArrayList<User>();

        User user1 = new User("huelton", "password111", "huelton@yahoo.com");
        User user2 = new User("joao", "password222", "joao@yahoo.com");
        User user3 = new User("andre", "password333", "andre@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);

    }
	
}
