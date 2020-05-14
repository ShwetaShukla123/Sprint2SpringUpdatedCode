package com.capgemini.wallet.signuplogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.wallet.signuplogin.model.WalletUser;
import com.capgemini.wallet.signuplogin.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
@RequestMapping("/loginpage")
public class UserController {

	@Autowired
	private UserService userService;
	
		
	@RequestMapping(method = RequestMethod.POST,value = "/register")
	public boolean register(@RequestBody WalletUser userEntityObj){
		boolean flag = false;
		try {
			if(userService.register(userEntityObj)=="User Registered successfully")
				flag = true;
			else
				flag = false;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return flag;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/login")
	public ResponseEntity<String> login(@RequestBody WalletUser userEntityObj){
		return new ResponseEntity<String>(userService.login(userEntityObj),HttpStatus.OK);
	}
	
}
