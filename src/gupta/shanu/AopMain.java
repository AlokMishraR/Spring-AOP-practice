package gupta.shanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gupta.shanu.service.FactoryService;
import gupta.shanu.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		FactoryService factory = new FactoryService();
		ShapeService shapeService = (ShapeService) factory.getBean("shapeService");
		shapeService.getCircle();
	}

}