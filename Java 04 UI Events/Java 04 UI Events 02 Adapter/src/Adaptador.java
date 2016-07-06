import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.SwingUtilities;


public class Adaptador extends MouseAdapter implements KeyListener{
	Ventana v=null;
	//Evento que ocurre cuando se haga click en el mouse
	
	public void cambiaTexto(){
		v.etiqueta.setText(v.texto.getText());
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		//es donde va a estar el codigo
		//El texto del textfield pasa a la etiqueta
		cambiaTexto();
		//if (SwingUtilities.isRightMouseButton(arg0) )
			
	}

	public Adaptador(Ventana v){
		this.v=v;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode()==KeyEvent.VK_ENTER)
			cambiaTexto();
		JButton elBoton=(JButton) arg0.getSource();
		elBoton.getName();
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

	
	

	
}
