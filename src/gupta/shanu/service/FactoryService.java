package gupta.shanu.service;

import gupta.shanu.model.Circle;
import gupta.shanu.model.Triangle;

public class FactoryService {
	public Object getBean(String beanName){
		if(beanName.equals("shapeService")) return new ShapeServiceProxy();
		else if(beanName.equals("circle")) return new Circle();
		else if(beanName.equals("triangle")) return new Triangle();
		return null;
	}
}
