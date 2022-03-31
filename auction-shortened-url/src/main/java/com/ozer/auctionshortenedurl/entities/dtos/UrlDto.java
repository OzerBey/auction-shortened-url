package com.ozer.auctionshortenedurl.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlDto {

	private String url;
	private String expirationDate;
}
