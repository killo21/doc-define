import java.awt.BorderLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class main extends JFrame {

    main() {
        initUI();
    }


    private void initUI() {
        final JTextField searchField = new JTextField("Searcy"); 
        final JPanel controls = new JPanel(new GridBagLayout()); 
        GridBagConstraints c = new GridBagConstraints();
        c.weightx=1.0;
        c.fill=GridBagConstraints.VERTICAL;
        controls.add(searchField,c); 
        controls.add(new JPanel(){
            {}}); 
        setLayout(new BorderLayout());
        add(controls, BorderLayout.NORTH);
        pack();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);

            }
        });
    }
}