package com.capgemini.wallet.signuplogin.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.wallet.signuplogin.model.WalletUser;
import com.capgemini.wallet.signuplogin.repository.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	

	public String register(WalletUser userEntityObj) {
		try {
			if(userRepository.existsById(userEntityObj.getUserId())) {
				return "User Id already exists";
			}
			userRepository.save(userEntityObj);
			return "User Registered successfully";
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Some Error occured";
	}

	public String login(WalletUser userEntityObj) {
		
		String returnString = "Login Successful";
		
		try
		{
			WalletUser userEntity = userRepository.findById(userEntityObj.getUserId()).get();
		
 		
		if(!userEntityObj.getPassword().equals(userEntity.getPassword()))
			returnString="Invalid Password";
		 
			return returnString;
		}
		catch (NoSuchElementException ex)
		{
			return "Invalid UserId";
		}
	}
}

