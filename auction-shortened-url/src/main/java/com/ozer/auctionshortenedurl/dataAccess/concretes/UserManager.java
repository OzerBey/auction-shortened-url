package com.ozer.auctionshortenedurl.dataAccess.concretes;

import java.util.List;

import com.ozer.auctionshortenedurl.business.abstracts.UserService;
import com.ozer.auctionshortenedurl.dataAccess.abstracts.UserDao;
import com.ozer.auctionshortenedurl.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
