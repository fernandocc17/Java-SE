package interfaces;
import guis.ContactDisplayPanel;
import guis.ContactEditorPanel;
import guis.ContactSelectorPanel;




public interface ContactMediator{
    public void setContactDisplayPanel(ContactDisplayPanel displayPanel);
    public void setContactEditorPanel(ContactEditorPanel editorPanel);
    public void setContactSelectorPanel(ContactSelectorPanel selectorPanel);
    public void createContact(String firstName, String lastName, String title, String organization);
    public void updateContact(String firstName, String lastName, String title, String organization);
    public Contact [] getAllContacts();
    public void selectContact(Contact contact);
}