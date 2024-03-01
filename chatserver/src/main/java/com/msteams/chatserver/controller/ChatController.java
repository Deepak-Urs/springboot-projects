package com.msteams.chatserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.msteams.chatserver.model.Message;

@Controller
public class ChatController {
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@MessageMapping("/message") // we receive the messages from the client over here, @ /app/message
	@SendTo("/chatroom/public")
	private Message receivePublicMessage(@Payload Message message) {
		return message;
	}
	
	@MessageMapping("/private-message")
	public Message receivePrivateMessage(@Payload Message message) {
		simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message); //user/David/private
		return message;
	}
}
