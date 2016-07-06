import Abstract.Address;

public class FrenchAddress extends Address{
    private static final String COUNTRY = "FRANCE";
    
    public String getCountry(){ return COUNTRY; }
    
    public String getFullAddress(){
        return getStreet() + EOL_STRING +
            getPostalCode() + SPACE + getCity() +
            EOL_STRING + COUNTRY + EOL_STRING;
    }
}