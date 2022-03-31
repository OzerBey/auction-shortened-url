package com.ozer.auctionshortenedurl.business.abstracts;

import com.ozer.auctionshortenedurl.entities.concretes.Url;
import com.ozer.auctionshortenedurl.entities.dtos.UrlDto;

public interface UrlService {
	public Url generateShortLink(UrlDto urlDto);

	public Url persistShortLink(Url url);

	public Url getEncodedUrl(String url);

	public void deleteShortLink(Url url);
}
