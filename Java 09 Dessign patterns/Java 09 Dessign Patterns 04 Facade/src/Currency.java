import java.text.NumberFormat;
public class Currency{
    private char currencySymbol;
    private NumberFormat numberFormat;
    
    public void setCurrencySymbol(char newCurrencySymbol){ currencySymbol = newCurrencySymbol; }
    public void setNumberFormat(NumberFormat newNumberFormat){ numberFormat = newNumberFormat; }
    
    public char getCurrencySymbol(){ return currencySymbol; }
    public NumberFormat getNumberFormat(){ return numberFormat; }
}