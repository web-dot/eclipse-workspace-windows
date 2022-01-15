package com.threadsafety;
//immutable class -> thread safe
public final class MessageService {
	
	private final String message;
	
	public MessageService(String message) {
		this.message = message;
	}
}
