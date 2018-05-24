package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import entity.User;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext3.xml");
		
		UserService userService=(UserService) ac.getBean("userService");
		
		User user=new User();
		user.setUsername("fff");
		user.setPassword("777");
		
		userService.add(user);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
