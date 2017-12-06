package gupta.shanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gupta.shanu.service.ShapeService;

public class AopMain1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		//shapeService.getCircle().setName("Dummy Circle name");
		//shapeService.getCircle().setNameWithReturn("Dummy");
		shapeService.getCircle();
		//System.out.println(shapeService.getCircle().getName());
	}

}