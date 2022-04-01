package com.ozer.auctionshortenedurl.businessTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ozer.auctionshortenedurl.business.concretes.UrlManager;

class UserManagerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		UrlManager urlManager = new UrlManager();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private Object urlManager;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

		fail("Not yet implemented");
	}

}
