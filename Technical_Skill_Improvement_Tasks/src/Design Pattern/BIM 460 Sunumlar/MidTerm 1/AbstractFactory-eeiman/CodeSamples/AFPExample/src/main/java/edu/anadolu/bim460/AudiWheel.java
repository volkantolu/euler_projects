package edu.anadolu.bim460;

public class AudiWheel extends Wheel{

	private int radius = 20;
	private String type = "sport";

	@Override
	public int getRadius() {
		return this.radius;
	}

	@Override
	public String getType() {
		return this.type;
	}
}
