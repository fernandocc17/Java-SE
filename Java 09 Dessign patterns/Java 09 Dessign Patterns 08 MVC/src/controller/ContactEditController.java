package controller;

import java.awt.event.*;

import model.ContactModel;

import views.ContactEditView;

public class ContactEditController implements ActionListener{
    private ContactModel model;
    private ContactEditView view;
    
    public ContactEditController(ContactModel m, ContactEditView v){
        model = m;
        view = v;
    }
    
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();
        if (source == view.getUpdateRef()){
            updateModel();
        }
    }
    
    private void updateModel(){
        String firstName = null;
        String lastName = null;
        if (isAlphabetic(view.getFirstName())){
            firstName = view.getFirstName();
        }
        if (isAlphabetic(view.getLastName())){
            lastName = view.getLastName();
        }
        model.updateModel( firstName, lastName,
            view.getTitle(), view.getOrganization());
    }
    
    private boolean isAlphabetic(String input){
        char [] testChars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < testChars.length; i++){
            if (input.indexOf(testChars[i]) != -1){
                return false;
            }
        }
        return true;
    }
}