import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private JPanel searchInPanel;                                   //Panel contains Field Name, Text area and buttons
    private JTextField searchInTextField;                           //Search In Text Field
    private JLabel searchInFieldName;                               //Search In Field Name
    private JButton browseButton;                                   //Browse Button
    private JPanel searchForPanel;                                   //
    private JTextField searchForTextField;                          //Search For Text Field
    private JLabel searchForFieldName;                              //Search For Field Name
    private JButton searchButton;                                   //Search Button

    /**
     * Builder method:
     * Start the window configurations and components
     */
    public Window(){
        super ();
        windowConfigure();
        startComponents();
    }

    /**
     * Method to start the window configurations
     */
    private void windowConfigure(){
        this.setTitle("File Finder Group D");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Method to start the window components
     */
    private void startComponents(){
        searchInPanel = new JPanel();
        searchInFieldName = new JLabel();
        searchInTextField = new JTextField(55);
        browseButton = new JButton();

        searchForPanel = new JPanel();
        searchForFieldName = new JLabel();
        searchForTextField = new JTextField(55);
        searchButton = new JButton();


        searchInFieldName.setText("Search In:");
        //searchInFieldName.setBounds(50,50,100,25);
        //searchInTextField.setSize(30,30);
        browseButton.setText("Browse...");
        //browseButton.setBounds(50,100,200,30);

        searchForFieldName.setText("Search For:");
        searchButton.setText("Search");

        searchInPanel.add(searchInFieldName);
        searchInPanel.add(searchInTextField);
        searchInPanel.add(browseButton);
        searchForPanel.add(searchForFieldName);
        searchForPanel.add(searchForTextField);
        searchForPanel.add(searchButton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(searchInPanel, BorderLayout.WEST);
        this.getContentPane().add(searchForPanel, BorderLayout.SOUTH);
    }

    /**
     * Main method:
     * Creates the window object and set it visible
     * @param args
     */
    public static void main(String [] args){
        JFrame window = new Window();
        window.setVisible(true);
    }
}