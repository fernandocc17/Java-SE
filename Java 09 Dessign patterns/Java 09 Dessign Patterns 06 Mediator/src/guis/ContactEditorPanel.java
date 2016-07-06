package guis;


import interfaces.Contact;
import interfaces.ContactMediator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ContactEditorPanel extends JPanel implements ActionListener{
    private ContactMediator mediator;
    private JTextField firstName, lastName, title, organization;
    private JButton create, update;
    
    public ContactEditorPanel(){
        createGui();
    }
    public ContactEditorPanel(ContactMediator newMediator){
        setContactMediator(newMediator);
        createGui();
    }
    public void createGui(){
        setLayout(new BorderLayout());
        
        JPanel editor = new JPanel();
        editor.setLayout(new GridLayout(4, 2));
        editor.add(new JLabel("First Name:"));
        firstName = new JTextField(20);
        editor.add(firstName);
        editor.add(new JLabel("Last Name:"));
        lastName = new JTextField(20);
        editor.add(lastName);
        editor.add(new JLabel("Title:"));
        title = new JTextField(20);
        editor.add(title);
        editor.add(new JLabel("Organization:"));
        organization = new JTextField(20);
        editor.add(organization);
        add(editor, BorderLayout.CENTER);
        
        JPanel control = new JPanel();
        create = new JButton("Create Contact");
        update = new JButton("Update Contact");
        create.addActionListener(this);
        update.addActionListener(this);
        control.add(create);
        control.add(update);
        add(control, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();
        if (source == create){
            createContact();
        }
        else if (source == update){
            updateContact();
        }
    }
    
    public void createContact(){
        mediator.createContact(firstName.getText(), lastName.getText(),
            title.getText(), organization.getText());
    }
    public void updateContact(){
        mediator.updateContact(firstName.getText(), lastName.getText(),
            title.getText(), organization.getText());
    }
    
    public void setContactFields(Contact contact){
        firstName.setText(contact.getFirstName());
        lastName.setText(contact.getLastName());
        title.setText(contact.getTitle());
        organization.setText(contact.getOrganization());
    }
    public void setContactMediator(ContactMediator newMediator){
        mediator = newMediator;
    }
}