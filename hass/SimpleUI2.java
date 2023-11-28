import javax.swing.*;

public class SimpleUI2 extends JFrame {
    public void sampleMethod() {
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            SimpleUI simpleUI = new SimpleUI();
            simpleUI.sampleMethod();
            dispose();
        });

        add(backButton);
        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
