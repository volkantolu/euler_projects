
public class TurkishBuyer extends Buyer {

	public TurkishBuyer(Mediator mediator) {
		super(mediator, "tl");
		this.mediator.registerTurkishBuyer(this);
	}
}

