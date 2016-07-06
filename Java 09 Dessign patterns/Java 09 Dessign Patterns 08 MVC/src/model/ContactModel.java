package model;
import interfaces.ContactView;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactModel{
    private String firstName;
    private String lastName;
    private String title;
    private String organization;
    private ArrayList contactViews = new ArrayList();
    
    public ContactModel(){
        this(null);
    }
    public ContactModel(ContactView view){
        firstName = "";
        lastName = "";
        title = "";
        organization = "";
        if (view != null){
            contactViews.add(view);
        }
    }
    
    public void addContactView(ContactView view){
        if (!contactViews.contains(view)){
            contactViews.add(view);
        }
    }
    
    public void removeContactView(ContactView view){
        contactViews.remove(view);
    }
    
    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getTitle(){ return title; }
    public String getOrganization(){ return organization; }
    
    public void setFirstName(String newFirstName){ firstName = newFirstName; }
    public void setLastName(String newLastName){ lastName = newLastName; }
    public void setTitle(String newTitle){ title = newTitle; }
    public void setOrganization(String newOrganization){ organization = newOrganization; }
    
    public void updateModel(String newFirstName, String newLastName,
        String newTitle, String newOrganization){
        if (!isEmptyString(newFirstName)){
            setFirstName(newFirstName);
        }
        if (!isEmptyString(newLastName)){
            setLastName(newLastName);
        }
        if (!isEmptyString(newTitle)){
            setTitle(newTitle);
        }
        if (!isEmptyString(newOrganization)){
            setOrganization(newOrganization);
        }
        updateView();
    }
    
    private boolean isEmptyString(String input){
        return ((input == null) || input.equals(""));
    }
    
    private void updateView(){
        Iterator notifyViews = contactViews.iterator();
        while (notifyViews.hasNext()){
            ((ContactView)notifyViews.next()).refreshContactView(firstName, lastName, title, organization);
        }
    }
}