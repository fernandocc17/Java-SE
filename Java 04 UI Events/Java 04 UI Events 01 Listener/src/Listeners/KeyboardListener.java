//https://github.com/fernandocc17, July 2016.
package Listeners;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;


public class KeyboardListener implements KeyListener{
	JOptionPane dialog=new JOptionPane();
	KeyEvent pressed=null;
	@Override
	public void keyPressed(KeyEvent arg0) {
		JOptionPane.showMessageDialog(null, "A key was pressed.");
		pressed=arg0;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		JOptionPane.showMessageDialog(null, "They key was released.");
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	//	if(presionado.getKeyCode()==K)
	}

}
