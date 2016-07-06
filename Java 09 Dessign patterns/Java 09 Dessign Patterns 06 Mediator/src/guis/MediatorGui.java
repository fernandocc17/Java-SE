package guis;

import guis.ContactSelectorPanel;

import interfaces.ContactMediator;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MediatorGui{
    private ContactMediator mediator;
    
    public void setContactMediator(ContactMediator newMediator){ mediator = newMediator; }
    
    public void createGui(){
        JFrame mainFrame = new JFrame("Mediator example");
        Container content = mainFrame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        ContactSelectorPanel select = new ContactSelectorPanel(mediator);
        ContactDisplayPanel display = new ContactDisplayPanel(mediator);
        ContactEditorPanel edit = new ContactEditorPanel(mediator);
        content.add(select);
        content.add(display);
        content.add(edit);
        mediator.setContactSelectorPanel(select);
        mediator.setContactDisplayPanel(display);
        mediator.setContactEditorPanel(edit);
        mainFrame.addWindowListener(new WindowCloseManager());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    private class WindowCloseManager extends WindowAdapter{
        public void windowClosing(WindowEvent evt){
            System.exit(0);
        }
    }
}


