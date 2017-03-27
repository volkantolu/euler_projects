package mt2.mediator.ex1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guvenc
 */
public class EuropeanBuyer extends Buyer {

	public EuropeanBuyer(Mediator mediator) {
		super(mediator, "euro");
		this.mediator.registerEuropeanBuyer(this);
	}
}
