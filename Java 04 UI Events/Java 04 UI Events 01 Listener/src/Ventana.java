import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Ventana  extends JFrame{
 JButton boton=null;
 JTextField texto=null;
 
 public Ventana(){
	 boton=new JButton("El boton");
	 texto=new JTextField("El campo de texto");
	 initialize();
	 
	 this.getContentPane().add(boton);
	 this.getContentPane().add(texto);
	 this.setVisible(true);
	 this.setSize(400, 250);
	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 this.addWindowListener(new Listener());
	 texto.addKeyListener(new EscuchadorTeclado());
	 boton.setMnemonic(KeyEvent.VK_X);
 }
 private void initialize(){
	 /*boton.setSize(50, 50);
	 texto.setSize(50, 50);
	 FlowLayout fl=new FlowLayout();
	 this.setLayout(fl);*/
	 this.setLayout(null);
	 
	 boton.setBounds(50, 50, 50, 50);
	 texto.setBounds(100, 100, 100, 100);
	 
 }
}
