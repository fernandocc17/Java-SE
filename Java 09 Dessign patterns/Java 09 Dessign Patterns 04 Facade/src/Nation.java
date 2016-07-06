import java.text.NumberFormat;
public class Nation {
    private char symbol;
    private String name;
    private String dialingPrefix;
    private String propertyFileName;
    private NumberFormat numberFormat;
    
    public Nation(String newName, char newSymbol, String newDialingPrefix,
        String newPropertyFileName, NumberFormat newNumberFormat) {
        name = newName;
        symbol = newSymbol;
        dialingPrefix = newDialingPrefix;
        propertyFileName = newPropertyFileName;
        numberFormat = newNumberFormat;
    }
    
    public String getName(){ return name; }
    public char getSymbol(){ return symbol; }
    public String getDialingPrefix(){ return dialingPrefix; }
    public String getPropertyFileName(){ return propertyFileName; }
    public NumberFormat getNumberFormat(){ return numberFormat; }
    
    public String toString(){ return name; }
}