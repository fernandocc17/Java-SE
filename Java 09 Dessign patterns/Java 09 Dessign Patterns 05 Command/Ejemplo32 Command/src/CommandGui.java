import interfaces.Location;
import interfaces.UndoableCommand;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class CommandGui implements ActionListener, LocationEditor{
    private JFrame mainFrame;
    private JTextArea display;
    private JTextField updatedLocation;
    private JButton update, undo, redo, exit;
    private JPanel controlPanel, displayPanel, editorPanel;
    private UndoableCommand command;
    private Appointment appointment;
    
    public CommandGui(UndoableCommand newCommand){
        command = newCommand;
    }
    
    public void setAppointment(Appointment newAppointment){
        appointment = newAppointment;
    }
    
    public void createGui(){
        mainFrame = new JFrame("Command Pattern Example");
        Container content = mainFrame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        
        editorPanel = new JPanel();
        editorPanel.add(new JLabel("Location"));
        updatedLocation = new JTextField(20);
        editorPanel.add(updatedLocation);
        content.add(editorPanel);
        
        displayPanel = new JPanel();
        display = new JTextArea(10, 40);
        display.setEditable(false);
        displayPanel.add(display);
        content.add(displayPanel);
        
        controlPanel = new JPanel();
        update = new JButton("Update Location");
        undo = new JButton("Undo Location");
        redo = new JButton("Redo Location");
        exit = new JButton("Exit");
        controlPanel.add(update);
        controlPanel.add(undo);
        controlPanel.add(redo);
        controlPanel.add(exit);
        content.add(controlPanel);
        
        update.addActionListener(this);
        undo.addActionListener(this);
        redo.addActionListener(this);
        exit.addActionListener(this);
        
        refreshDisplay();
        mainFrame.addWindowListener(new WindowCloseManager());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt){
        Object originator = evt.getSource();
        if (originator == update){
            executeCommand();
        }
        if (originator == undo){
            undoCommand();
        }
        if (originator == redo){
            redoCommand();
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
    
    public Location getNewLocation(){
        return new LocationImpl(updatedLocation.getText());
    }
    
    private void executeCommand(){
        command.execute();
        refreshDisplay();
    }
    
    private void undoCommand(){
        command.undo();
        refreshDisplay();
    }
    
    private void redoCommand(){
        command.redo();
        refreshDisplay();
    }
    
    private void refreshDisplay(){
        display.setText(appointment.toString());
    }
    
    private void exitApplication(){
        System.exit(0);
    }
}