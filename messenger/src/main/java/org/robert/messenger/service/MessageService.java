package org.robert.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.robert.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message msg1 = new Message(1L, "Robert", "msg1");
		Message msg2 = new Message(2L, "Rob", "msg2");
		List<Message> list = new ArrayList<>();
		list.add(msg1);
		list.add(msg2);
		
		return list;
	}
}
