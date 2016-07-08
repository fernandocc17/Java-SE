//https://github.com/fernandocc17, July 2016.
import javax.swing.JFrame;
public class OtherWindow {
	public JFrame frame;
	public OtherWindow() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("New window");
	}
}