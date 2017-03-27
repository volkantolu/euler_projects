
public class TurkishBuyer extends Buyer {

	public TurkishBuyer(Mediator mediator) {
		super(mediator, "turk lirasi");
		this.mediator.registerTurkishBuyer(this);
	}
}

