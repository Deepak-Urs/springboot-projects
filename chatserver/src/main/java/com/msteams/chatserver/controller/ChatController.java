package com.msteams.chatserver.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.msteams.chatserver.model.Message;

@Controller
public class ChatController {
	
	
	@MessageMapping("/message") // we receive the messages from the client over here, @ /app/message
	@SendTo("/chatroom/public")
	private Message receivePublicMessage(@Payload Message message) {
		return message;
	}
}
