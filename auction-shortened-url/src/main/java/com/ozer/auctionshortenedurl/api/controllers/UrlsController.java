package com.ozer.auctionshortenedurl.api.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozer.auctionshortenedurl.business.abstracts.UrlService;
import com.ozer.auctionshortenedurl.entities.concretes.Url;
import com.ozer.auctionshortenedurl.entities.dtos.UrlDto;
import com.ozer.auctionshortenedurl.entities.dtos.UrlErrorResponseDto;
import com.ozer.auctionshortenedurl.entities.dtos.UrlResponseDto;

@RestController
@RequestMapping("/url")
public class UrlsController {
	@Autowired
	UrlService urlService;

	@PostMapping("/generate")
	public ResponseEntity<?> generateShortLink(@RequestBody UrlDto urlDto) {
		Url urlToRet = urlService.generateShortLink(urlDto);

		if (urlToRet != null) {
			UrlResponseDto urlResponseDto = new UrlResponseDto();
			urlResponseDto.setOriginalUrl(urlToRet.getOriginalUrl());
			urlResponseDto.setExpirationDate(urlToRet.getExpirationDate());
			urlResponseDto.setShortUrl(urlToRet.getShortUrl());
			return new ResponseEntity<UrlResponseDto>(urlResponseDto, HttpStatus.OK);
		}

		UrlErrorResponseDto urlErrorResponseDto = new UrlErrorResponseDto();
		urlErrorResponseDto.setStatus("404");
		urlErrorResponseDto.setError("There was an error processing your request. please try again.");
		return new ResponseEntity<UrlErrorResponseDto>(urlErrorResponseDto, HttpStatus.OK);

	}

	@GetMapping("/{shortLink}")
	public ResponseEntity<?> redirectToOriginalUrl(@PathVariable String shortLink, HttpServletResponse response)
			throws IOException {

		Url urlToRet = urlService.getEncodedUrl(shortLink);

		response.sendRedirect(urlToRet.getOriginalUrl());
		return new ResponseEntity<UrlResponseDto>(HttpStatus.OK);

	}
}
