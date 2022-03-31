package com.ozer.auctionshortenedurl.business.concretes;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.ozer.auctionshortenedurl.business.abstracts.UrlService;
import com.ozer.auctionshortenedurl.dataAccess.abstracts.UrlDao;
import com.ozer.auctionshortenedurl.entities.concretes.Url;
import com.ozer.auctionshortenedurl.entities.dtos.UrlDto;

@Service
public class UrlManager implements UrlService {

	@Autowired
	public UrlDao urlDao;

	@Override
	public Url generateShortLink(UrlDto urlDto) {

		if (StringUtils.isNotEmpty(urlDto.getUrl())) {
			String encodedUrl = encodeUrl(urlDto.getUrl());
			Url urlToPersist = new Url();
			urlToPersist.setCreationDate(LocalDateTime.now());
			urlToPersist.setOriginalUrl(urlDto.getUrl());
			urlToPersist.setShortUrl(encodedUrl);
			Url urlToRet = persistShortLink(urlToPersist);

			if (urlToRet != null)
				return urlToRet;

			return null;
		}
		return null;
	}

	private String encodeUrl(String url) {
		String encodedUrl = "ozer.com";// my example of end-point
		LocalDateTime time = LocalDateTime.now();
		encodedUrl += "/"
				+ Hashing.murmur3_32().hashString(url.concat(time.toString()), StandardCharsets.UTF_8).toString();
		return encodedUrl;
	}

	@Override
	public Url persistShortLink(Url url) {
		Url urlToRet = urlDao.save(url);
		return urlToRet;
	}

	@Override
	public Url getEncodedUrl(String url) {
		Url urlToRet = urlDao.findByShortUrl(url);
		return urlToRet;
	}

	@Override
	public void deleteShortLink(Url url) {
		urlDao.delete(url);

	}

}
