package interfaces;
import java.io.Serializable;
public interface Address extends Serializable{
    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";
    public static final String COMMA = ",";
    public String getType();
    public String getDescription();
    public String getStreet();
    public String getCity();
    public String getState();
    public String getZipCode();

    public void setType(String newType);
    public void setDescription(String newDescription);
    public void setStreet(String newStreet);
    public void setCity(String newCity);
    public void setState(String newState);
    public void setZipCode(String newZip);
}
