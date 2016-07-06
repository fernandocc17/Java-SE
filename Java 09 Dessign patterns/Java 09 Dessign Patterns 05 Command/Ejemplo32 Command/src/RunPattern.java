import interfaces.Contact;

import java.util.Calendar;
import java.util.Date;

public class RunPattern{
    private static Calendar dateCreator = Calendar.getInstance();
    
    public static void main(String [] arguments){
        System.out.println("Example for the Command pattern");
        System.out.println();
        System.out.println("This sample will use a command class called");
        System.out.println(" ChangeLocationCommand to update the location");
        System.out.println(" of an Appointment object.");
        System.out.println("The ChangeLocationCommand has the additional");
        System.out.println(" ability to undo and redo commands, so it can");
        System.out.println(" set the locaition back to its original value,");
        System.out.println(" if desired.");
        System.out.println();
        
        System.out.println("Creating an Appointment for use in the demo");
        Contact [] people = { new ContactImpl(), new ContactImpl() };
        Appointment appointment = new Appointment("Java Twister Semi-Finals",
            people, new LocationImpl(""), createDate(2001, 10, 31, 14, 30),
            createDate(2001, 10, 31, 14, 31));
        
        System.out.println("Creating the ChangeLocationCommand");
        ChangeLocationCommand cmd = new ChangeLocationCommand();
        cmd.setAppointment(appointment);
        
        System.out.println("Creating the GUI");
        CommandGui application = new CommandGui(cmd);
        application.setAppointment(appointment);
        cmd.setLocationEditor(application);
        application.createGui();
        
    }
    public static Date createDate(int year, int month, int day, int hour, int minute){
        dateCreator.set(year, month, day, hour, minute);
        return dateCreator.getTime();
    }
}