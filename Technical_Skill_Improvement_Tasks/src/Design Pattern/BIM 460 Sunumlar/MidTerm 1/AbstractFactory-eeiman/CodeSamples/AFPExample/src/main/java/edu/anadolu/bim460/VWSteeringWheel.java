package edu.anadolu.bim460;

public class VWSteeringWheel extends SteeringWheel{
	
	private int radius = 25;
	private String rawMaterial = "leather";

	@Override
	public int getRadius() {
		return this.radius;
	}

	@Override
	public String getRawMaterial() {
		return this.rawMaterial;
	}
}
