import Abstract.PhoneNumber;

public class USPhoneNumber extends PhoneNumber{
    private static final String COUNTRY_CODE = "01";
    private static final int NUMBER_LENGTH = 10;
    
    public String getCountryCode(){ return COUNTRY_CODE; }
    
    public void setPhoneNumber(String newNumber){
        if (newNumber.length() == NUMBER_LENGTH){
            super.setPhoneNumber(newNumber);
        }
    }
}