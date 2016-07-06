package views;

import interfaces.ContactView;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import model.ContactModel;

import controller.ContactEditController;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ContactEditView extends JPanel implements ContactView{
    private static final String UPDATE_BUTTON = "Update";
    private static final String EXIT_BUTTON = "Exit";
    private static final String CONTACT_FIRST_NAME = "First Name  ";
    private static final String CONTACT_LAST_NAME = "Last Name  ";
    private static final String CONTACT_TITLE = "Title  ";
    private static final String CONTACT_ORG = "Organization  ";
    private static final int FNAME_COL_WIDTH = 25;
    private static final int LNAME_COL_WIDTH = 40;
    private static final int TITLE_COL_WIDTH = 25;
    private static final int ORG_COL_WIDTH = 40;
    private ContactEditController controller;
    private JLabel firstNameLabel, lastNameLabel, titleLabel, organizationLabel;
    private JTextField firstName, lastName, title, organization;
    private JButton update, exit;
    
    public ContactEditView(ContactModel model){
        controller = new ContactEditController(model, this);
        createGui();
    }
    public ContactEditView(ContactModel model, ContactEditController newController){
        controller = newController;
        createGui();
    }
    
    public void createGui(){
        update = new JButton(UPDATE_BUTTON);
        exit = new JButton(EXIT_BUTTON);
        
        firstNameLabel = new JLabel(CONTACT_FIRST_NAME);
        lastNameLabel = new JLabel(CONTACT_LAST_NAME);
        titleLabel = new JLabel(CONTACT_TITLE);
        organizationLabel = new JLabel(CONTACT_ORG);
        
        firstName = new JTextField(FNAME_COL_WIDTH);
        lastName = new JTextField(LNAME_COL_WIDTH);
        title = new JTextField(TITLE_COL_WIDTH);
        organization = new JTextField(ORG_COL_WIDTH);
        
        JPanel editPanel = new JPanel();
        editPanel.setLayout(new BoxLayout(editPanel, BoxLayout.X_AXIS));
        
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(0, 1));
        
        labelPanel.add(firstNameLabel);
        labelPanel.add(lastNameLabel);
        labelPanel.add(titleLabel);
        labelPanel.add(organizationLabel);
        
        editPanel.add(labelPanel);
        
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(0, 1));
        
        fieldPanel.add(firstName);
        fieldPanel.add(lastName);
        fieldPanel.add(title);
        fieldPanel.add(organization);
        
        editPanel.add(fieldPanel);
        
        JPanel controlPanel = new JPanel();
        controlPanel.add(update);
        controlPanel.add(exit);
        update.addActionListener(controller);
        exit.addActionListener(new ExitHandler());
        
        setLayout(new BorderLayout());
        add(editPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }
    
    public Object getUpdateRef(){ return update; }
    public String getFirstName(){ return firstName.getText(); }
    public String getLastName(){ return lastName.getText(); }
    public String getTitle(){ return title.getText(); }
    public String getOrganization(){ return organization.getText(); }
    
    public void refreshContactView(String newFirstName,
        String newLastName, String newTitle,
        String newOrganization){
        firstName.setText(newFirstName);
        lastName.setText(newLastName);
        title.setText(newTitle);
        organization.setText(newOrganization);
    }
    
    private class ExitHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }
}