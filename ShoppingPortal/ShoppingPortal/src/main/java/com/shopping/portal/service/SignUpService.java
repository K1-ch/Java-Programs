package com.shopping.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.portal.entity.User;
import com.shopping.portal.repository.SignUpRepository;

@Service
public class SignUpService implements SignUpServiceI {

	@Autowired
	private SignUpRepository signUpRepository;

	@Override
	public User saveUser(User user) {
		user.setFullName(user.getFirstName()+ " "+ user.getLastName());
		return signUpRepository.save(user);
	}

}
