package edu.anadolu.bim460;

public class Skoda extends Car{

	@Override
	public String getPicture() {
		return "skoda.png";
	}

	@Override
	public SteeringWheel getSteeringWheel() {
		return new SkodaSteeringWheel();
	}

	@Override
	public Wheel getWheel() {
		return new SkodaWheel();
	}

}
