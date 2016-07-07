//https://github.com/fernandocc17, July 2016.
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Window extends JFrame {
	private static final long serialVersionUID = -7854931754386329026L;
	JRadioButton rboton=new JRadioButton("Radio's text");
	JCheckBox check=new JCheckBox("CheckBox's text");
	JList lista=new JList();
	JComboBox combo=new JComboBox();
	JTextField texto=new JTextField("Custom text");
	JPasswordField pass=new JPasswordField("My very secret and secure password");
	String userText=null;
	//Pretty explicit
	GridLayout gl=null;
	public Window(){
		//2 rows , 3 columns , 4 horizontal space y 5 vertical space
		gl=new GridLayout(2,3,4,5);
			this.setLayout(gl);
		this.getContentPane().add(rboton,0);
		this.getContentPane().add(check,1);	
		this.getContentPane().add(lista,2);
		this.getContentPane().add(combo,3);
		this.getContentPane().add(texto,4);
		this.getContentPane().add(pass,5);	
		//The first parameter is the father, we can leave it null
		//showMessageDialog shows a popup
		JOptionPane.showMessageDialog(null, "Hello world");
		//showInputDialog ask the user for a string
		userText=JOptionPane.showInputDialog(rootPane, "Whats your name?");
		// uses the text that the user input
		JOptionPane.showMessageDialog(null, userText);
		//showConfirmDialog returns an int between 0 and 2 depending on the selected option
		JOptionPane.showConfirmDialog(null, "Quieres continuar");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}	
}
