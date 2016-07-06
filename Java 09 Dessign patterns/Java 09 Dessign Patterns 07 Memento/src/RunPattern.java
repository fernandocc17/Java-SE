public class RunPattern{
    public static void main(String [] arguments){
        System.out.println("Example for the Memento pattern");
        System.out.println();
        System.out.println("This example will use the AddressBook to demonstrate");
        System.out.println(" how a Memento can be used to save and restore state.");
        System.out.println("The AddressBook has an inner class, AddressBookMemento,");
        System.out.println(" that is used to store the AddressBook state... in this");
        System.out.println(" case, its internal list of contacts.");
        System.out.println();
        
        System.out.println("Creating the AddressBook");
        AddressBook book = new AddressBook();
        
        System.out.println("Adding Contact entries for the AddressBook");
        book.addContact(new ContactImpl("Peter", "Taggart", "Commander", "NSEA Protector", new AddressImpl()));
        book.addContact(new ContactImpl("Tawny", "Madison", "Lieutenant", "NSEA Protector", new AddressImpl()));
        book.addContact(new ContactImpl("Dr.", "Lazarus", "Dr.", "NSEA Protector", new AddressImpl()));
        book.addContact(new ContactImpl("Tech Sargent", "Chen", "Tech Sargent", "NSEA Protector", new AddressImpl()));
        
        System.out.println("Contacts added. Current Contact list:");
        System.out.println(book);
        System.out.println();
        
        System.out.println("Creating a Memento for the address book");
        Object memento = book.getMemento();
        System.out.println("Now that a Memento exists, it can be used to restore");
        System.out.println(" the state of this AddressBook object, or to set the");
        System.out.println(" state of a new AddressBook.");
        System.out.println();
        
        System.out.println("Creating new entries for the AddressBook");
        book.removeAllContacts();
        book.addContact(new ContactImpl("Jason", "Nesmith", "", "Actor's Guild", new AddressImpl()));
        book.addContact(new ContactImpl("Gwen", "DeMarco", "", "Actor's Guild", new AddressImpl()));
        book.addContact(new ContactImpl("Alexander", "Dane", "", "Actor's Guild", new AddressImpl()));
        book.addContact(new ContactImpl("Fred", "Kwan", "", "Actor's Guild", new AddressImpl()));
        
        System.out.println("New Contacts added. Current Contact list:");
        System.out.println(book);
        System.out.println();
        System.out.println("Using the Memento object to restore the AddressBook");
        System.out.println(" to its original state.");
        book.setMemento(memento);
        System.out.println("AddressBook restored. Current Contact list:");
        System.out.println(book);
        
    }
}