//https://github.com/fernandocc17, July 2016.
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
//Extending from JFrame to get all its properties
public class Window extends JFrame {
	//Unique ID for this kind of window...auto generated with Eclipse
	private static final long serialVersionUID = -2936294494585919792L;
	//This Layout set the object on the cardinals positions.
	BorderLayout bl=null;
	JButton button=new JButton("Button text");
	JLabel label=new JLabel("Label text");
	JTextField text=new JTextField("Text");
	JList list=new JList();
	JComboBox combo=new JComboBox();
	public Window(){
		//Instanciamos el layout a ser usado
		//Podemos decir que tanta distancia habra entre los bordes
		bl=new BorderLayout(5,10);
		//Definimos que Layout va a usar la ventana
		this.setLayout(bl);
		setTitle("Window's title");
		//BORDERLAYOUT.* is a predefinied constant
		//Getting the current contentPane to add the object to it.
		this.getContentPane().add(button,BorderLayout.NORTH);
		this.getContentPane().add(label,BorderLayout.EAST);
		this.getContentPane().add(list,BorderLayout.CENTER);
		this.getContentPane().add(text,BorderLayout.WEST);
		this.getContentPane().add(combo,BorderLayout.SOUTH);
		//This will make that when the user click X to close the window it will terminate the program.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}