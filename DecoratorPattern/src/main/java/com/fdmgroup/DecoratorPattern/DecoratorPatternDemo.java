package com.fdmgroup.DecoratorPattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new Circle();  //Circle with normal border
		Shape rectangle = new Rectangle(); //Rectangle with normal border

		Shape redCircle = new RedShapeDecorator(new Circle()); //Circle with Red border
		Shape blueCircle = new BlueShapeDecorator(new Circle()); //Circle with Blue border

		Shape redRectangle = new RedShapeDecorator(new Rectangle()); //Rectangle with Red border

		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

		System.out.println("\nCircle of Blue Border");
		blueCircle.draw();
		
		System.out.println("\nRectangle with normal border");
		rectangle.draw();
	}
}