package com.ozer.auctionshortenedurl.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;

	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

}
