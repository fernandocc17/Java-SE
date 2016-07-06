import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Ventana extends JFrame {

	JRadioButton rboton=new JRadioButton("Texto del radio");
	JCheckBox check=new JCheckBox("Texto del checkbox");
	JList lista=new JList();
	JComboBox combo=new JComboBox();
	JTextField texto=new JTextField("Texto del campo");
	JPasswordField pass=new JPasswordField("dfkjkfds");
	JOptionPane op=null;
	String rOp=null;
	
	GridLayout gl=null;
	
	public Ventana(){
		//2 filas , 3 columnas , 4 espaciado horizontal y 5 espaciado vertical
		gl=new GridLayout(2,3,4,5);
	
		this.setLayout(gl);
		this.getContentPane().add(rboton,0);
		this.getContentPane().add(check,1);	
		this.getContentPane().add(lista,2);
		this.getContentPane().add(combo,3);
		this.getContentPane().add(texto,4);
		this.getContentPane().add(pass,5);
		
		//El primer parametro es el componente "padre" , se puede dejar como null
		
		//showMessageDialog permite mostrar un mensaje con un popup al usuario
		op.showMessageDialog(null, "Hola mundo");
		//Permite pedirle al usuario un valor....lo regresa como string
		rOp=op.showInputDialog(rootPane, "Dame tu nombre");
		//Devuelve el nombre que dio el usuario
		op.showMessageDialog(null, rOp);
		
		//El confirmarDialog devuelve un entero entre 0 y 2 dependiendo del a opcion
		//Seleccionada por el usuario
		op.showConfirmDialog(null, "Quieres continuar");
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
}
