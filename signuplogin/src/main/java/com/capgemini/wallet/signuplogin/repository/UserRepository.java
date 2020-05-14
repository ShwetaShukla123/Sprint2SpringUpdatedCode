package com.capgemini.wallet.signuplogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.wallet.signuplogin.model.WalletUser;

public interface UserRepository extends JpaRepository<WalletUser, Integer>{

}
