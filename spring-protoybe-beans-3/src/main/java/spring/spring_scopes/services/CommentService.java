package spring.spring_scopes.services;

import org.springframework.stereotype.Service;

import spring.spring_scopes.models.Comment;
import spring.spring_scopes.processors.CommentProcessor;

@Service
public class CommentService {
	
	public void sendComment(Comment c) {
		CommentProcessor processor = new CommentProcessor();
		
		processor.processComment(c);
		processor.validateComment(c);
		
		c = processor.getComment();
		
		// nog dingen doen met c
		
		
		
		
		
	}
}
