package com.ozer.auctionshortenedurl;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import com.ozer.auctionshortenedurl.api.controllers.UrlsController;

public class UrlsControllerTest {
	// @RepeatedTest(value = 10)
	@Test
	public void getUrl(UrlsController urlsController, int urlId) {
		urlsController.delete(19);
	}
}
