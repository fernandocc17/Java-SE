//https://github.com/fernandocc17, July 2016.
package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import controller.Factorial;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class FactorialUI {
	private JFrame frmWindowTitle;
	JLabel lblResult = new JLabel("Result");
	JList jlOptions = new JList();
	JButton btnCalculate = new JButton("Calculate");
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialUI window = new FactorialUI();
					window.frmWindowTitle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FactorialUI() {
		initialize();
	}
	private void initialize() {
		frmWindowTitle = new JFrame();
		frmWindowTitle.setTitle("Factorial");
		frmWindowTitle.setBounds(100, 100, 587, 356);
		frmWindowTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindowTitle.getContentPane().setLayout(null);
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Long value=Long.valueOf(jlOptions.getSelectedValue().toString());
				lblResult.setText("Calculating...");
				//the update will be done to lblResult
				Factorial f=new Factorial(value,lblResult);
				//starting the swing worker thread
				f.execute();
				//please note that the UI is still usable for the user
			}
		});
		btnCalculate.setBounds(188, 59, 89, 23);
		frmWindowTitle.getContentPane().add(btnCalculate);
		lblResult.setBounds(323, 63, 145, 14);
		frmWindowTitle.getContentPane().add(lblResult);
		jlOptions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlOptions.setModel(new AbstractListModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"15", "30", "42", "50"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jlOptions.setBounds(93, 59, 56, 78);
		frmWindowTitle.getContentPane().add(jlOptions);
	}
}