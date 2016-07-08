//https://github.com/fernandocc17, July 2016.
package UI;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Listeners.JWindowListener;
import Listeners.KeyboardListener;


public class Window  extends JFrame{
private static final long serialVersionUID = -6293067763043961161L;
JButton button=null;
JTextField text=null;
 
 public Window(){
	 button=new JButton("The button");
	 text=new JTextField("Text");
	 initialize();
	 this.getContentPane().add(button);
	 this.getContentPane().add(text);
	 this.setVisible(true);
	 //size of the window
	 this.setSize(400, 250);
	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 //adding the custom JWindowListener to the JFrame
	 this.addWindowListener(new JWindowListener());
	 //adding the KeyBoard Listener to the JTextField
	 text.addKeyListener(new KeyboardListener());
	 button.setMnemonic(KeyEvent.VK_X);
 }
 private void initialize(){
	 //No Layout, this is also called AbsoluteLayout.
	 this.setLayout(null);
	 //putting the size 
	 //(insert from left, insert from top, size width, size height)
	 //This is not a cute UI =)
	 button.setBounds(50, 50, 50, 50);
	 text.setBounds(100, 100, 100, 100);
	 
 }
}
