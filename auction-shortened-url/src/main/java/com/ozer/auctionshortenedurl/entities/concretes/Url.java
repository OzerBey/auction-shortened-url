package com.ozer.auctionshortenedurl.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "url")
public class Url {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "url_id")
	private int urlId;

	@Column(name = "original_url")
	private String originalUrl;

	@Column(name = "short_url")
	private String shortUrl;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

}
