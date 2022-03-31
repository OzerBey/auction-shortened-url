package com.ozer.auctionshortenedurl.business.abstracts;

import java.util.List;

import com.ozer.auctionshortenedurl.core.utilities.results.DataResult;
import com.ozer.auctionshortenedurl.core.utilities.results.Result;
import com.ozer.auctionshortenedurl.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();

	Result add(User user);

}
