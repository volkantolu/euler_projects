/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guvenc
 */
public class Bank {
    Mediator mediator;
    public Bank(Mediator mediator){
        this.mediator = mediator;
    }

    public void updateCurrency(float euroUnit,float dolarUnit){
        mediator.updateCurrency(euroUnit, euroUnit);
    }

}
