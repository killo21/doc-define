import javax.swing.*;
import java.awt.*;

/**
 * Created by dmitr on 4/18/2017.
 */
public class Main{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                buildGUI();
            }
        });
    }

    private static void buildGUI() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        JFrame f = new JFrame("Doc-Define 0.2");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ComponentResizer cr = new ComponentResizer();
        JPanel mainPanel = new JPanel(null);
        f.add(mainPanel);

        JTextArea textArea = new JTextArea("Some text\nSome other text");
        cr.registerComponent(textArea);

        mainPanel.add(textArea);
        textArea.setBounds(50, 50, 200, 200);

        f.setSize(screenSize.width,screenSize.height);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
