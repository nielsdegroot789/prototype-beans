package spring.spring_scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.spring_scopes.configurations.ProjectConfig;
import spring.spring_scopes.services.CommentService;
import spring.spring_scopes.services.UserService;

public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        CommentService commentService = context.getBean(CommentService.class);
        
        boolean b = commentService.getCommentRepository() == userService.getCommentRepository();
        
        System.out.println(b);
    }
}
