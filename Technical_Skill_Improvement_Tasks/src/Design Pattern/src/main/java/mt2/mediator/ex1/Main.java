package mt2.mediator.ex1;
public class Main {

	public static void main(String[] args) {

		Mediator mediator = new Mediator();

		Buyer turkishBuyer = new TurkishBuyer(mediator);
		Buyer europeanBuyer = new EuropeanBuyer(mediator);
		float sellingPriceInDollars = 10.0f;
		AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
		DollarConverter dollarConverter = new DollarConverter(mediator);

		float turkishBidInTL = 10.0f;
		while (!turkishBuyer.attemptToPurchase(turkishBidInTL)) {
			turkishBidInTL += 2.0f;
		}

		float europeanBidInEuros = 3.0f;
		while (!europeanBuyer.attemptToPurchase(europeanBidInEuros)) {
			europeanBidInEuros += 1.0f;
		}

	}

}

