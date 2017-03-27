package edu.anadolu.bim460;

public class VW extends Car{

	@Override
	public String getPicture() {
		return "vw.png";
	}

	@Override
	public SteeringWheel getSteeringWheel() {
		return new VWSteeringWheel();
	}

	@Override
	public Wheel getWheel() {
		return new VWWheel();
	}

}
