import javax.swing.*;
import java.awt.*;

public class Main {
    private static int counter = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Counter: 0", SwingConstants.CENTER);
        JButton button = new JButton("Increase");

        button.addActionListener(e -> {
            counter++;
            label.setText("Count: " + counter);
        });

        frame.setLayout(new BorderLayout(8, 8));
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(240, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}