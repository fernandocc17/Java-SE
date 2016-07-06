import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class EscuchadorTeclado implements KeyListener{
	JOptionPane dialogo=new JOptionPane();
	KeyEvent presionado=null;
	@Override
	public void keyPressed(KeyEvent arg0) {
		dialogo.showMessageDialog(null, "Se presiono una tecla");
		presionado=arg0;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		dialogo.showMessageDialog(null, "Se solto una tecla");
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	//	if(presionado.getKeyCode()==K)
	}

}
