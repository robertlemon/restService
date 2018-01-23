package org.robert.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.robert.messenger.model.Message;
import org.robert.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService service = new MessageService();

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String get() 
//	{
//		return "hi";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return service.getAllMessages();
	}
}
