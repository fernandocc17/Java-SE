import interfaces.Address;

public class AddressImpl implements Address{
    private String type;
    private String description;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    
    public AddressImpl(){ }
    public AddressImpl(String newDescription, String newStreet,
        String newCity, String newState, String newZipCode){
        description = newDescription;
        street = newStreet;
        city = newCity;
        state = newState;
        zipCode = newZipCode;
    }
    
    public String getType(){ return type; }
    public String getDescription(){ return description; }
    public String getStreet(){ return street; }
    public String getCity(){ return city; }
    public String getState(){ return state; }
    public String getZipCode(){ return zipCode; }
    
    public void setType(String newType){ type = newType; }
    public void setDescription(String newDescription){ description = newDescription; }
    public void setStreet(String newStreet){ street = newStreet; }
    public void setCity(String newCity){ city = newCity; }
    public void setState(String newState){ state = newState; }
    public void setZipCode(String newZip){ zipCode = newZip; }
    
    public String toString(){
        return street + EOL_STRING + city + COMMA + SPACE +
            state + SPACE + zipCode + EOL_STRING;
    }
}