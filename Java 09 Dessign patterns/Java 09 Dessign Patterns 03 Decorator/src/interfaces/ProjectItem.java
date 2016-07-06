package interfaces;
import java.io.Serializable;
public interface ProjectItem extends Serializable{
    public static final String EOL_STRING = System.getProperty("line.separator");
    public double getTimeRequired();
}