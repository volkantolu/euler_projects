
public class Mediator {

	Buyer turkishBuyer;
	Buyer europeanBuyer;
	AmericanSeller americanSeller;
	DollarConverter dollarConverter;

	public Mediator() {
	}

	public void registerTurkishBuyer(TurkishBuyer swedishBuyer) {
		this.turkishBuyer = swedishBuyer;
	}

	public void registerEuropeanBuyer(EuropeanBuyer frenchBuyer) {
		this.europeanBuyer = frenchBuyer;
	}

	public void registerAmericanSeller(AmericanSeller americanSeller) {
		this.americanSeller = americanSeller;
	}

	public void registerDollarConverter(DollarConverter dollarConverter) {
		this.dollarConverter = dollarConverter;
	}

	public boolean placeBid(float bid, String unitOfCurrency) {
		float dollarAmount = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
		return americanSeller.isBidAccepted(dollarAmount);
	}
}

