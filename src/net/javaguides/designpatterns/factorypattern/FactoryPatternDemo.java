package net.javaguides.designpatterns.factorypattern;

import java.util.function.Supplier;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Supplier<ShapeFactory> shapeFactory = ShapeFactory::new;

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.get().getShape(ShapeType.CIRCLE);

		// call draw method of Circle
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.get().getShape(ShapeType.RECTANGLE);

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.get().getShape(ShapeType.SQUARE);

		// call draw method of square
		shape3.draw();
	}
}
