package mt2.mediator.ex2;
public class DollarConverter {

	Mediator mediator;

	private float dolarUnit = 1.0f;
	private float euroUnit = 0.741f;
	private float tlUnit = 1.523f;

	public DollarConverter(Mediator mediator) {
		this.mediator = mediator;
		mediator.registerDollarConverter(this);
	}

	private float convertEurosToDollars(float euros) {
		float dollars = euros * (dolarUnit / euroUnit);
		System.out.println("Converting " + euros + " euros to " + dollars + " dollars");
		return dollars;
	}

	private float convertTLToDollars(float tl) {
		float dollars = tl * (dolarUnit / tlUnit);
		System.out.println("Converting " + tl + " turkish lira to " + dollars + " dollars");
		return dollars;
	}

	public float convertCurrencyToDollars(float amount, String unitOfCurrency) {
		if ("tl".equalsIgnoreCase(unitOfCurrency)) {
			return convertTLToDollars(amount);
		} else {
			return convertEurosToDollars(amount);
		}
	}

        public void setDolarUnit(float dolarUnit){
            this.dolarUnit = dolarUnit;
        }

        public void setEuroUnit(float euroUnit){
            this.euroUnit = euroUnit;
        }

        public void setTLUnit(float tlUnit){
            this.tlUnit = tlUnit;
        }
}
