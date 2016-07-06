import interfaces.Contact;


public class ContactImpl implements Contact{
    private String firstName;
    private String lastName;
    private String title;
    private String organization;
    
    public ContactImpl(){}
    public ContactImpl(String newFirstName, String newLastName,
        String newTitle, String newOrganization){
            firstName = newFirstName;
            lastName = newLastName;
            title = newTitle;
            organization = newOrganization;
    }
    
    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getTitle(){ return title; }
    public String getOrganization(){ return organization; }
    
    public void setFirstName(String newFirstName){ firstName = newFirstName; }
    public void setLastName(String newLastName){ lastName = newLastName; }
    public void setTitle(String newTitle){ title = newTitle; }
    public void setOrganization(String newOrganization){ organization = newOrganization; }
    
    public String toString(){
        return firstName + SPACE + lastName;
    }
}