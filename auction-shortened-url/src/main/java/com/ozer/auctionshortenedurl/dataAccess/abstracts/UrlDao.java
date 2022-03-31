package com.ozer.auctionshortenedurl.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozer.auctionshortenedurl.entities.concretes.Url;

public interface UrlDao extends JpaRepository<Url, Integer> {
	public Url findByShortUrl(String shortUrl);
}
