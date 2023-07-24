package edu.global.ex.shape;

public class Triangle {
	private double width, height;

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return (width * height)/2;
	}
}
