package guis;

import interfaces.Contact;
import interfaces.ContactMediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ContactSelectorPanel extends JPanel implements ActionListener{
    private ContactMediator mediator;
    private JComboBox selector;
    
    public ContactSelectorPanel(){
        createGui();
    }
    public ContactSelectorPanel(ContactMediator newMediator){
        setContactMediator(newMediator);
        createGui();
    }
    
    public void createGui(){
        selector = new JComboBox(mediator.getAllContacts());
        selector.addActionListener(this);
        add(selector);
    }
    
    public void actionPerformed(ActionEvent evt){
        mediator.selectContact((Contact)selector.getSelectedItem());
    }
    public void addContact(Contact contact){
        selector.addItem(contact);
        selector.setSelectedItem(contact);
    }
    public void setContactMediator(ContactMediator newMediator){
        mediator = newMediator;
    }
}