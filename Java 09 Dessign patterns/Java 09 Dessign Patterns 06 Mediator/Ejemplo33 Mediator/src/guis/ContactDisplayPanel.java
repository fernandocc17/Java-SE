package guis;


import interfaces.Contact;
import interfaces.ContactMediator;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class ContactDisplayPanel extends JPanel{
    private ContactMediator mediator;
    private JTextArea displayRegion;
    
    public ContactDisplayPanel(){
        createGui();
    }
    public ContactDisplayPanel(ContactMediator newMediator){
        setContactMediator(newMediator);
        createGui();
    }
    public void createGui(){
        setLayout(new BorderLayout());
        displayRegion = new JTextArea(10, 40);
        displayRegion.setEditable(false);
        add(new JScrollPane(displayRegion));
    }
    public void contactChanged(Contact contact){
        displayRegion.setText(
            "Contact\n\tName: " + contact.getFirstName() +
            " " + contact.getLastName() + "\n\tTitle: " +
            contact.getTitle() + "\n\tOrganization: " +
            contact.getOrganization());
    }
    public void setContactMediator(ContactMediator newMediator){
        mediator = newMediator;
    }
}