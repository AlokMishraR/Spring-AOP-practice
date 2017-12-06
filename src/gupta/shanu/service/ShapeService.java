package gupta.shanu.service;

import gupta.shanu.annotations.Loggable;
import gupta.shanu.model.Circle;
import gupta.shanu.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
		System.out.println("getCircle gets called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
