import java.util.Properties;
import java.io.IOException;
import java.io.FileOutputStream;
public class DataCreator{
    private static final String GUI_TITLE = "title";
    private static final String EXIT_CAPTION = "exit";
    private static final String COUNTRY_LABEL = "country";
    private static final String CURRENCY_LABEL = "currency";
    private static final String PHONE_LABEL = "phone";
    
    public static void serialize(String fileName){
        saveFrData();
        saveUsData();
        saveNlData();
    }
    
    private static void saveFrData(){
        try{
            Properties textSettings = new Properties();
            textSettings.setProperty(GUI_TITLE, "Demonstration du Pattern Facade");
            textSettings.setProperty(EXIT_CAPTION, "Sortir");
            textSettings.setProperty(COUNTRY_LABEL, "Pays");
            textSettings.setProperty(CURRENCY_LABEL, "Monnaie");
            textSettings.setProperty(PHONE_LABEL, "Numero de Telephone");
            textSettings.store(new FileOutputStream("french.properties"), "French Settings");
        }
        catch (IOException exc){
            System.err.println("Error storing settings to output");
            exc.printStackTrace();
        }
    }
    private static void saveUsData(){
        try{
            Properties textSettings = new Properties();
            textSettings.setProperty(GUI_TITLE, "Facade Pattern Demonstration");
            textSettings.setProperty(EXIT_CAPTION, "Exit");
            textSettings.setProperty(COUNTRY_LABEL, "Country");
            textSettings.setProperty(CURRENCY_LABEL, "Currency");
            textSettings.setProperty(PHONE_LABEL, "Phone Number");
            textSettings.store(new FileOutputStream("us.properties"), "US Settings");
        }
        catch (IOException exc){
            System.err.println("Error storing settings to output");
            exc.printStackTrace();
        }
    }
    private static void saveNlData(){
        try{
            Properties textSettings = new Properties();
            textSettings.setProperty(GUI_TITLE, "Facade Pattern voorbeeld");
            textSettings.setProperty(EXIT_CAPTION, "Exit");
            textSettings.setProperty(COUNTRY_LABEL, "Land");
            textSettings.setProperty(CURRENCY_LABEL, "Munt eenheid");
            textSettings.setProperty(PHONE_LABEL, "Telefoonnummer");
            textSettings.store(new FileOutputStream("dutch.properties"), "Dutch Settings");
        }
        catch (IOException exc){
            System.err.println("Error storing settings to output");
            exc.printStackTrace();
        }
    }
}