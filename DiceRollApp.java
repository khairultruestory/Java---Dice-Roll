//compile with javac DiceRollApp.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceRollApp extends JFrame {

    private JLabel resultLabel;

    public DiceRollApp() {
        setTitle("Dice Roll App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JButton rollButton = new JButton("Roll the Dice");
        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });

        mainPanel.add(Box.createVerticalStrut(30));
        mainPanel.add(rollButton);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(resultLabel);

        add(mainPanel);
    }

    private void rollDice() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        resultLabel.setText("You rolled a " + diceRoll);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DiceRollApp().setVisible(true);
            }
        });
    }
}
