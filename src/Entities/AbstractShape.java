package Entities;

public abstract class AbstractShape implements Shape {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
