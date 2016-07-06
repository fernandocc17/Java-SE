import java.util.HashMap;
import java.text.NumberFormat;
import java.util.Locale;
public class InternationalizationWizard{
    private HashMap map;
    private Currency currency = new Currency();
    private InternationalizedText propertyFile = new InternationalizedText();
    
    public InternationalizationWizard() {
        map = new HashMap();
        Nation[] nations = {
            new Nation("US", '$', "+1", "us.properties", NumberFormat.getInstance(Locale.US)),
            new Nation("The Netherlands", 'f', "+31", "dutch.properties", NumberFormat.getInstance(Locale.GERMANY)),
            new Nation("France", 'f', "+33", "french.properties", NumberFormat.getInstance(Locale.FRANCE))
        };
        for (int i = 0; i < nations.length; i++) {
            map.put(nations[i].getName(), nations[i]);
        }
    }
    
    public void setNation(String name) {
        Nation nation = (Nation)map.get(name);
        if (nation != null) {
            currency.setCurrencySymbol(nation.getSymbol());
            currency.setNumberFormat(nation.getNumberFormat());
            PhoneNumber.setSelectedInterPrefix(nation.getDialingPrefix());
            propertyFile.setFileName(nation.getPropertyFileName());
        }
    }
    
    public Object[] getNations(){
        return map.values().toArray();
    }
    public Nation getNation(String name){
        return (Nation)map.get(name);
    }
    public char getCurrencySymbol(){
        return currency.getCurrencySymbol();
    }
    public NumberFormat getNumberFormat(){
        return currency.getNumberFormat();
    }
    public String getPhonePrefix(){
        return PhoneNumber.getSelectedInterPrefix();
    }
    public String getProperty(String key){
        return propertyFile.getProperty(key);
    }
    public String getProperty(String key, String defaultValue){
        return propertyFile.getProperty(key, defaultValue);
    }
}