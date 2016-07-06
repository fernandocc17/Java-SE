
import interfaces.Contact;

import java.io.File;

import clases.ContactImpl;
import clases.Deliverable;
import clases.DependentProjectItem;
import clases.SupportedProjectItem;
import clases.Task;

import abstracts.ProjectDecorator;
public class RunPattern{
    public static void main(String [] arguments){
        System.out.println("Example for the Decorator pattern");
        System.out.println();
        System.out.println("This demonstration will show how Decorator classes can be used");
        System.out.println(" to extend the basic functionality of ProjectItems. The Task and");
        System.out.println(" Deliverable classes provide the basic ProjectItems, and their");
        System.out.println(" functionality will be extended by adding subclasses of the");
        System.out.println(" abstract class ProjectDecorator.");
        System.out.println();
        System.out.println("Note that the toString method has been overridden for all ProjectItems,");
        System.out.println(" to more effectively show how Decorators are associated with their");
        System.out.println(" ProjectItems.");
        System.out.println();
        
        System.out.println("Creating ProjectItems.");
        Contact contact1 = new ContactImpl("Simone", "Roberto", "Head Researcher and Chief Archivist", "Institute for Advanced (Java) Studies");
        Task task1 = new Task("Perform months of diligent research", contact1, 20.0);
        Task task2 = new Task("Obtain grant from World Java Foundation", contact1, 40.0);
        Deliverable deliverable1 = new Deliverable("Java History", "Comprehensive history of the design of all Java APIs", contact1);
        System.out.println("ProjectItem objects created. Results:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(deliverable1);
        System.out.println();
        
        System.out.println("Creating decorators");
        ProjectDecorator decorator1 = new SupportedProjectItem(new File("JavaHistory.txt"));
        ProjectDecorator decorator2 = new DependentProjectItem(task2);
        System.out.println("Decorators created. Adding decorators to the first task");
        decorator1.setProjectItem(task1);
        decorator2.setProjectItem(decorator1);
        System.out.println();
        System.out.println("Decorators added. Results");
        System.out.println(decorator2);
        
        System.out.println("");
    }
}