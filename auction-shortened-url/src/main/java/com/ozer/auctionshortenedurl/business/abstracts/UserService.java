package com.ozer.auctionshortenedurl.business.abstracts;

import java.util.List;

import com.ozer.auctionshortenedurl.entities.concretes.User;

public interface UserService {

	List<User> getAll();
}
