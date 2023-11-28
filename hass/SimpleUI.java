import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleUI extends JFrame {
    public void sampleMethod() {
        JButton button = new JButton("ITULOY MO!!");

        button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                SimpleUI2 simpleUI2 = new SimpleUI2();
                simpleUI2.sampleMethod();
                dispose();
            }

        });

        add(button);
        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}