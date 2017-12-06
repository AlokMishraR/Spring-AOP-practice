package gupta.shanu.service;

import gupta.shanu.aspect.LoggingAspect;
import gupta.shanu.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle(){
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
