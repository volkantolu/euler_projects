import java.text.NumberFormat;

/**
 * Created by IntelliJ IDEA.
 * User: aydin
 * Date: 29.Mar.2010
 * Time: 22:45:30
 * To change this template use File | Settings | File Templates.
 */
class Currency{
    private char currencySymbol;
    private NumberFormat numberFormat;

    public void setCurrencySymbol(char newCurrencySymbol){ currencySymbol = newCurrencySymbol; }
    public void setNumberFormat(NumberFormat newNumberFormat){ numberFormat = newNumberFormat; }

    public char getCurrencySymbol(){ return currencySymbol; }
    public NumberFormat getNumberFormat(){ return numberFormat; }
}
