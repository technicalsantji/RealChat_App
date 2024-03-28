/**
 * @author santji
 * @date 27-Mar-2024
 */
package com.sant;

/**
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GraphQLController {
	@Autowired
	private MessageRepository messageRepository;
//	@SchemaMapping()
	@QueryMapping("messages")
    public List<Message> getMessages() {
		List<Message> all = this.messageRepository.findAll();
		
		return all;
	}
}

