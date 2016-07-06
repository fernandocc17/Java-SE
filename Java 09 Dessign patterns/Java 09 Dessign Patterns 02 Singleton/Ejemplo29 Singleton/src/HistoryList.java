import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class HistoryList{
    //lista con el historial de los comandos hechos, esta sincronizada xq hay dos GUI abiertas
	private List history = Collections.synchronizedList(new ArrayList());
    
	//Objeto estatico privado para que nadie pueda acceder a el
	private static HistoryList instance = new HistoryList();
    
    //constructor privado para que nadie pueda construir un objeto HistoryList
    private HistoryList(){ }
    
    //devuelve la referencia al objeto privado
    public static HistoryList getInstance(){
        return instance;
    }
    public void addCommand(String command){
    	//a–ade a la lista el comando enviado
        history.add(command);
    }
    //retira de la lista el ultimo comando
    public Object undoCommand(){
        return history.remove(history.size() - 1);
    }
    
    public String toString(){
    	//Prepara una cadena para regresarla
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < history.size(); i++){
            result.append("  ");
            result.append(history.get(i));
            result.append("\n");
        }
        //devuelve la cadena preparada con todo el historial
        return result.toString();
    }
}