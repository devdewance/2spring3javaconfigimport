package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;

public class TestRun {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 Service serv=(CustomerBo)context.getBean("cust");
		 serv.display("Customer");
		
		 Service serv1=(ManagerBo)context.getBean("manager");
		 serv1.display("manager");
	}
}
