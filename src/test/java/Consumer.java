import org.springframework.context.support.ClassPathXmlApplicationContext;

import www.wuluyang.IUserService.UserService;

public class Consumer {
public static void main(String[] args) {
	ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer.xml");
	app.start();
	UserService userService= (UserService)app.getBean("UserService");
	String name=userService.getUserId(1);
	System.out.println("消费端从生产者获取到name:"+name);
	
}
}
