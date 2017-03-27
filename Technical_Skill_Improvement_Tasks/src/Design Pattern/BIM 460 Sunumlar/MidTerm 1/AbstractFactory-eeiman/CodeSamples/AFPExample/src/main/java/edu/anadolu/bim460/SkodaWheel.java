package edu.anadolu.bim460;

public class SkodaWheel extends Wheel{

	private int radius = 18;
	private String type = "normal";

	@Override
	public int getRadius() {
		return this.radius;
	}

	@Override
	public String getType() {
		return this.type;
	}
}
