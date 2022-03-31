package com.ozer.auctionshortenedurl.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ozer.auctionshortenedurl.business.abstracts.UserService;
import com.ozer.auctionshortenedurl.core.utilities.results.DataResult;
import com.ozer.auctionshortenedurl.core.utilities.results.Result;
import com.ozer.auctionshortenedurl.core.utilities.results.SuccessDataResult;
import com.ozer.auctionshortenedurl.dataAccess.abstracts.UserDao;
import com.ozer.auctionshortenedurl.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Users listed");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessDataResult<>("User registered");
	}

}
