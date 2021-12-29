import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaWithSwing extends JFrame {
    JLabel lblCountClicked;
    JButton okButton;
    JTextField inputTextField;
    int count;
    LambdaWithSwing(){
        count = 0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        inputTextField = new JTextField();
        getContentPane().add(inputTextField);

        okButton = new JButton("OK");
        getContentPane().add(okButton);
        okButton.addActionListener(e -> {
                count = count + 1;
                lblCountClicked.setText("Clicked " + count + " times");
        });

        lblCountClicked = new JLabel("Click count");
        getContentPane().add(lblCountClicked);


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LambdaWithSwing();
            }
        });
    }
}
