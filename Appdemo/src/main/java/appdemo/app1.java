package appdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
	
	public static void main(String[] args) {
		
		

		ApplicationContext context12= new ClassPathXmlApplicationContext("din3.xml");
		
		Applicationclass n=(Applicationclass)context12.getBean("applicationclass");
		
		n.dina();
		
		din a=(din)context12.getBean("din1");
		a.dim();
		
	}
	
}
