package mt2.mediator.ex1;
public class DollarConverter {

	Mediator mediator;

	private float DOLLAR_UNIT = 1.0f;
	private float EURO_UNIT = 0.741f;
	private float TL_UNIT = 1.523f;

	public DollarConverter(Mediator mediator) {
		this.mediator = mediator;
		mediator.registerDollarConverter(this);
	}

	private float convertEurosToDollars(float euros) {
		float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
		System.out.println("Converting " + euros + " euros to " + dollars + " dollars");
		return dollars;
	}

	private float convertTLToDollars(float tl) {
		float dollars = tl * (DOLLAR_UNIT / TL_UNIT);
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
}
