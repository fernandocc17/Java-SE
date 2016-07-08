//https://github.com/fernandocc17, July 2016.
package ui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import adapter.JAdapter;
public class Window extends JFrame{
	private static final long serialVersionUID = -6191233959128303242L;
	public JLabel label=null;
	JButton boton=null;
	public JTextField text=null;
	public Window(){
		boton =new JButton("Click here!");
		label=new JLabel("Label to change");
		text=new JTextField("Textfield text");
		//The code is pretty explicit
		this.getRootPane().setDefaultButton(boton);
		this.setLayout(null);
		boton.setBounds(50, 50, 50, 50);
		label.setBounds(100, 50, 150, 150);
		text.setBounds(200, 200, 200, 200);
		this.add(boton);
		this.add(label);
		this.add(text);
		JAdapter a=new JAdapter(this);
		boton.addMouseListener(a);
		boton.addKeyListener(a);
		this.setSize(1024, 768);
		this.setVisible(true);
	}
	
	
	
}
