package spring.spring_scopes.processors;

import spring.spring_scopes.models.Comment;

public class CommentProcessor {

	private Comment comment;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	public void processComment(Comment c) {
//		process comment
	}
	
	public void validateComment(Comment c) {
		// validate commment
	}
}
