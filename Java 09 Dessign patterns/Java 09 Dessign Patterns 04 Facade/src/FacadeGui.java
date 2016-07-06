import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class FacadeGui implements ActionListener, ItemListener{
    private static final String GUI_TITLE = "title";
    private static final String EXIT_CAPTION = "exit";
    private static final String COUNTRY_LABEL = "country";
    private static final String CURRENCY_LABEL = "currency";
    private static final String PHONE_LABEL = "phone";
    
    private JFrame mainFrame;
    private JButton exit;
    private JComboBox countryChooser;
    private JPanel controlPanel, displayPanel;
    private JLabel countryLabel, currencyLabel, phoneLabel;
    private JTextField currencyTextField, phoneTextField;
    private InternationalizationWizard nationalityFacade;
    
    public FacadeGui(InternationalizationWizard wizard){
        nationalityFacade = wizard;
    }
    
    public void createGui(){
        mainFrame = new JFrame(nationalityFacade.getProperty(GUI_TITLE));
        Container content = mainFrame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        
        displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(3, 2));
        
        countryLabel = new JLabel(nationalityFacade.getProperty(COUNTRY_LABEL));
        countryChooser = new JComboBox(nationalityFacade.getNations());
        currencyLabel = new JLabel(nationalityFacade.getProperty(CURRENCY_LABEL));
        currencyTextField = new JTextField();
        phoneLabel = new JLabel(nationalityFacade.getProperty(PHONE_LABEL));
        phoneTextField = new JTextField();
        
        currencyTextField.setEditable(false);
        phoneTextField.setEditable(false);
        
        displayPanel.add(countryLabel);
        displayPanel.add(countryChooser);
        displayPanel.add(currencyLabel);
        displayPanel.add(currencyTextField);
        displayPanel.add(phoneLabel);
        displayPanel.add(phoneTextField);
        content.add(displayPanel);
        
        controlPanel = new JPanel();
        exit = new JButton(nationalityFacade.getProperty(EXIT_CAPTION));
        controlPanel.add(exit);
        content.add(controlPanel);
        
        exit.addActionListener(this);
        countryChooser.addItemListener(this);
        
        mainFrame.addWindowListener(new WindowCloseManager());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
    private void updateGui(){
        nationalityFacade.setNation(countryChooser.getSelectedItem().toString());
        mainFrame.setTitle(nationalityFacade.getProperty(GUI_TITLE));
        countryLabel.setText(nationalityFacade.getProperty(COUNTRY_LABEL));
        currencyLabel.setText(nationalityFacade.getProperty(CURRENCY_LABEL));
        phoneLabel.setText(nationalityFacade.getProperty(PHONE_LABEL));
        exit.setText(nationalityFacade.getProperty(EXIT_CAPTION));

        currencyTextField.setText(nationalityFacade.getCurrencySymbol() + " " +
            nationalityFacade.getNumberFormat().format(5280.50));
        phoneTextField.setText(nationalityFacade.getPhonePrefix());

        mainFrame.invalidate();
        countryLabel.invalidate();
        currencyLabel.invalidate();
        phoneLabel.invalidate();
        exit.invalidate();
        mainFrame.validate();
    }
    
    public void actionPerformed(ActionEvent evt){
        Object originator = evt.getSource();
        if (originator == exit){
            exitApplication();
        }
    }
    public void itemStateChanged(ItemEvent evt){
        Object originator = evt.getSource();
        if (originator == countryChooser){
            updateGui();
        }
    }
    
    public void setNation(Nation nation){
        countryChooser.setSelectedItem(nation);
    }
    
    private class WindowCloseManager extends WindowAdapter{
        public void windowClosing(WindowEvent evt){
            exitApplication();
        }
    }
    
    private void exitApplication(){
        System.exit(0);
    }
}