package edu.anadolu.bim460;

public class VWWheel extends Wheel{
	
	private int radius = 19;
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
