package com.ozer.auctionshortenedurl.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlResponseDto {
	private String originalUrl;
	private String shortUrl;
	// private LocalDateTime expirationDate;
}
