package edu.anadolu.bim460;

public class Audi extends Car{

	@Override
	public String getPicture() {
		return "audi.png";
	}

	@Override
	public SteeringWheel getSteeringWheel() {
		return new AudiSteeringWheel();
	}

	@Override
	public Wheel getWheel() {
		return new AudiWheel();
	}

}
