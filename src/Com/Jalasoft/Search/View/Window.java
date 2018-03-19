import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private JPanel textPanel;
    private JTextField textPath;
    private JTextArea areaPath;


    public Window (String title) {
        super (title);

        textPanel = new JPanel();
        areaPath = new JTextArea("Path");
        textPath = new JTextField(30);


        textPanel.add(areaPath);
        textPanel.add(textPath);

    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(textPanel, BorderLayout.WEST);

    }

    public static void main (String [] args) {
        JFrame window = new Window ("File Finder Group D");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setVisible(true);
    }

}

