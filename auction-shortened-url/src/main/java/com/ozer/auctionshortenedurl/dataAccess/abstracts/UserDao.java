package com.ozer.auctionshortenedurl.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozer.auctionshortenedurl.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
