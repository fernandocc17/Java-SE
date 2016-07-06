import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class SingletonGui implements ActionListener{
    private JFrame mainFrame;
    private JTextArea display;
    private JButton newContact, newAppointment, undo, refresh, exit;
    private JPanel controlPanel, displayPanel;
    //variable unica para la clase SingletonGui, que sirve de contador para saber cuan grande es el historial
    private static int historyCount;
    
    //creacion de la interfaz de usuario
    public void createGui(){
        mainFrame = new JFrame("Singleton Pattern Example");
        Container content = mainFrame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        
        displayPanel = new JPanel();
        display = new JTextArea(20, 60);
        display.setEditable(false);
        displayPanel.add(display);
        content.add(displayPanel);
        
        controlPanel = new JPanel();
        newContact = new JButton("Create contact");
        newAppointment = new JButton("Create appointment");
        undo = new JButton("Undo");
        refresh = new JButton("Refresh");
        exit = new JButton("Exit");
        controlPanel.add(newContact);
        controlPanel.add(newAppointment);
        controlPanel.add(undo);
        controlPanel.add(refresh);
        controlPanel.add(exit);
        content.add(controlPanel);
        
        newContact.addActionListener(this);
        newAppointment.addActionListener(this);
        undo.addActionListener(this);
        refresh.addActionListener(this);
        exit.addActionListener(this);
        //clase estatica que cierra la aplicacion
        mainFrame.addWindowListener(new WindowCloseManager());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    //Actualiza el TextArea con todos los comandos actuales y arriba pone el que recibe.
    public void refreshDisplay(String actionMessage){
        display.setText(actionMessage + "\nCOMMAND HISTORY:\n" +
            HistoryList.getInstance().toString());
    }
    //Captura el evento en el caso que se de click en un boton.
    public void actionPerformed(ActionEvent evt){
    
    	Object originator = evt.getSource();
    	//Compara el objeto que lo produjo con los botones para encontrar el correspondiente.
        
    	if (originator == newContact){
    		//pasa una cadena mostrando el comando "ejecutado"
            addCommand(" New Contact");
        }
        else if (originator == newAppointment){
            addCommand(" New Appointment");
        }
        else if (originator == undo){
            undoCommand();
        }
        else if (originator == refresh){
            refreshDisplay("");
        }
        else if (originator == exit){
            exitApplication();
        }
    }
    
    private class WindowCloseManager extends WindowAdapter{
        public void windowClosing(WindowEvent evt){
            exitApplication();
        }
    }
    
    private void addCommand(String message){
    //obtiene el unico objeto que existe del historial y le a–ade el 
    	HistoryList.getInstance().addCommand((++historyCount) + message);
    //actualiza el textarea y pone al inicio el ultimo comando 
        refreshDisplay("Add Command: " + message);
    }
    
    private void undoCommand(){
    	//obtiene el unico objeto que existe del historial y le a–ade el 
    	Object result = HistoryList.getInstance().undoCommand();
        historyCount--;
        refreshDisplay("Undo Command: " + result);
    }
    
    private void exitApplication(){
        System.exit(0);
    }
}