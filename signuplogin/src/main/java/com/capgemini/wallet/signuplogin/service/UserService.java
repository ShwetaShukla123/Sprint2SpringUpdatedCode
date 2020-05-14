package com.capgemini.wallet.signuplogin.service;

import com.capgemini.wallet.signuplogin.model.WalletUser;

public interface UserService {

	public String register(WalletUser userEntityObj);
	public String login(WalletUser userEntityObj);
}
