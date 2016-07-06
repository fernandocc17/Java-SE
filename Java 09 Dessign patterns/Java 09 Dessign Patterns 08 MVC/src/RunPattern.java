import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.ContactModel;

import views.ContactDisplayView;
import views.ContactEditView;
public class RunPattern{
    public static void main(String [] arguments){
        System.out.println("Example for the MVC pattern");
        System.out.println();
        System.out.println("In this example, a Contact is divided into");
        System.out.println(" Model, View and Controller components.");
        System.out.println();
        System.out.println("To illustrate the flexibility of MVC, the same");
        System.out.println(" Model will be used to provide information");
        System.out.println(" to two View components.");
        System.out.println();
        System.out.println("One view, ContactEditView, will provide a Contact");
        System.out.println(" editor window and will be paired with a controller");
        System.out.println(" called ContactEditController.");
        System.out.println();
        System.out.println("The other view, ContactDisplayView, will provide a");
        System.out.println(" display window which will reflect the changes made");
        System.out.println(" in the editor window. This view does not support");
        System.out.println(" user interaction, and so does not provide a controller.");
        System.out.println();
        
        //Crea el modelo del contacto
        System.out.println("Creating ContactModel");
        ContactModel model = new ContactModel();
        
        //Crea la vista y el controlador para editar el modelo
        System.out.println("Creating ContactEditView and ContactEditController");
        ContactEditView editorView = new ContactEditView(model);
        
        model.addContactView(editorView);
        createGui(editorView, "Contact Edit Window");
        
        //Crea la vista para ver al contacto
        System.out.println("Creating ContactDisplayView");
        ContactDisplayView displayView = new ContactDisplayView();
        
        
        model.addContactView(displayView);
        createGui(displayView, "Contact Display Window");
    }
    
    private static void createGui(JPanel contents, String title){
        JFrame applicationFrame = new JFrame(title);
        applicationFrame.getContentPane().add(contents);
        applicationFrame.addWindowListener(new WindowCloseManager());
        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }
    //clase interna para cerrar la aplicacion
    private static class WindowCloseManager extends WindowAdapter{
        public void windowClosing(WindowEvent evt){
            System.exit(0);
        }
    }
}