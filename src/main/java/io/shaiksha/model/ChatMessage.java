package io.shaiksha.model;

import io.shaiksha.config.MessageType;

public class ChatMessage {
		
	private String sender;
	private String content;
	private MessageType type;
	
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
}
