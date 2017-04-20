import java.awt.*;
import javax.swing.*;

public class Button {
    public Button() {
        final JFrame frame = new JFrame("Demo buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        buttonPanel.add(new JButton("Export do SVG"));
        buttonPanel.add(new JButton("Export do PNG"));
        buttonPanel.add(new JButton("Tisk..."));
        ComponentResizer cr = new ComponentResizer();
        JPanel east = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        east.add(buttonPanel, gbc);

        JPanel center = new JPanel(){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };
        JTextArea textArea = new JTextArea("Some text\nSome other text");
        cr.registerComponent(textArea);
        center.add(textArea);
        textArea.setBounds(50, 50, 200, 200);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(east, BorderLayout.EAST);
        frame.add(center);

        frame.setVisible(true);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Button();
            }
        });
    }
}