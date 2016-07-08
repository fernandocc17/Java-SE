//https://github.com/fernandocc17, July 2016.
package Listeners;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

//implementing the interface WindowListener, this make all the methods on that interface to be implemented here.
public class JWindowListener implements WindowListener{
	@Override
	public void windowActivated(WindowEvent arg0) {
		JOptionPane.showMessageDialog(null, "The window was activated");
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		//dialogo.showMessageDialog(null, "Se abrio la ventana");
	}
}