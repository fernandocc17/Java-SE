//https://github.com/fernandocc17, July 2016.
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Events {
	private JFrame frame;
	public static void main(String[] args) {
		//this creates a thread for the UI
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events window = new Events();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Events() {
		initialize();
	}
	//create the entire UI
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("New button");
		//adding the Listener directly to the button.
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new OtherWindow().frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(122, 65, 117, 29);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(92, 153, 61, 16);
		frame.getContentPane().add(lblNewLabel);
	}
}