import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;


public class Ventana extends JFrame {

	BorderLayout bl=null;
	
	JButton boton=new JButton("Texto del boton");
	JLabel etiqueta=new JLabel("Texto de la label");
	JTextField texto=new JTextField("Texto de la caja");
	JList lista=new JList();
	JComboBox combo=new JComboBox();
	
	
	public Ventana(){
		//Instanciamos el layout a ser usado
		//Podemos decir que tanta distancia habra entre los bordes
		bl=new BorderLayout(5,10);
		//Definimos que Layout va a usar la ventana
		this.setLayout(bl);
		
		setTitle("Titulo de la ventana");
		//A–adimos el boton en la parte norte de nuestro layout
		//BORDERLAYOUT.NORTH ya es una constante predefinida
		this.getContentPane().add(boton,BorderLayout.NORTH);
		
		this.getContentPane().add(etiqueta,BorderLayout.EAST);
		
		this.getContentPane().add(lista,BorderLayout.CENTER);
		//Agregamos al Frame sin especificar donde se va a contener,
		//puede resultar confuso sino se especifica a quien(Panel,internalFrame...
		this.getContentPane().add(texto,BorderLayout.WEST);

		this.getContentPane().add(combo,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
