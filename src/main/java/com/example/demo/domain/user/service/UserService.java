package com.example.demo.domain.user.service;

import java.util.List;
import com.example.demo.domain.user.model.MUser;

public interface UserService {
	public void signup(MUser user);
	public List<MUser> getUsers();
}