//https://github.com/fernandocc17, July 2016.
package adapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import ui.Window;
//an adapter like MouseAdapter is just a class that implements the mouselistener, so you can extend and just override the method you need, cleaner code =). 
//We are using an adapter and a listener, this is the way Java kind of implements multiple inheritance.
public class JAdapter extends MouseAdapter implements KeyListener{
	Window v=null;
	//The Adapter receives the window so it can access all the fields.
	public JAdapter(Window v){
		this.v=v;
	}
	public void changeText(){
		//changing the text from the textfield to the label.
		v.label.setText(v.text.getText());
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		//The text will change from the textfield to the label
		changeText();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
	//If the key pressed(getKeyCode() ) is enter, it will invoque changeText.
		if (arg0.getKeyCode()==KeyEvent.VK_ENTER)
			changeText();
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