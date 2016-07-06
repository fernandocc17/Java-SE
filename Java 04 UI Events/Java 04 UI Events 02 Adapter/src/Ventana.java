import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ventana extends JFrame{
	
	JLabel etiqueta=null;
	JButton boton=null;
	JTextField texto=null;
	
	public Ventana(){
		
		boton =new JButton("Click AQUI!");
		etiqueta=new JLabel("Etiqueta a cambiar");
		texto=new JTextField("El campo");
		this.getRootPane().setDefaultButton(boton);
		
		this.setLayout(null);
		
		boton.setBounds(50, 50, 50, 50);
		etiqueta.setBounds(100, 50, 150, 150);
		texto.setBounds(200, 200, 200, 200);
		
		this.add(boton);
		this.add(etiqueta);
		this.add(texto);
		Adaptador a=new Adaptador(this);
		boton.addMouseListener(a);
		boton.addKeyListener(a);
		this.setSize(1024, 768);
		this.setVisible(true);
	}
	
	
	
}
