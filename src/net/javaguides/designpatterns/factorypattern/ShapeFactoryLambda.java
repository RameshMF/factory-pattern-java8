package net.javaguides.designpatterns.factorypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactoryLambda {
	final static Map<ShapeType, Supplier<Shape>> map = new HashMap<>();
	static {
		map.put(ShapeType.CIRCLE, Circle::new);
		map.put(ShapeType.RECTANGLE, Rectangle::new);
		map.put(ShapeType.SQUARE, Square::new);
	}

	public Shape getShape(ShapeType shapeType) {
		Supplier<Shape> shape = map.get(shapeType);
		if (shape != null) {
			return shape.get();
		}
		throw new IllegalArgumentException("No such shape " + shapeType.name());
	}
}
