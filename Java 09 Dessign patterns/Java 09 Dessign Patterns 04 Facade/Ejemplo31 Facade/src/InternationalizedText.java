import java.util.Properties;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
public class InternationalizedText{
    private static final String DEFAULT_FILE_NAME = "";
    private Properties textProperties = new Properties();
    
    public InternationalizedText(){
        this(DEFAULT_FILE_NAME);
    }
    public InternationalizedText(String fileName){
        loadProperties(fileName);
    }
    
    public void setFileName(String newFileName){
        if (newFileName != null){
            loadProperties(newFileName);
        }
    }
    public String getProperty(String key){
        return getProperty(key, "");
    }
    public String getProperty(String key, String defaultValue){
        return textProperties.getProperty(key, defaultValue);
    }
    
    private void loadProperties(String fileName){
        try{
            FileInputStream input = new FileInputStream(fileName);
            textProperties.load(input);
        }
        catch (IOException exc){
            textProperties = new Properties();
        }
    }
}
