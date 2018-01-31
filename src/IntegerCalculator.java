/* Andrew Godfrey
 * Software Engineering
 * 1 - 31 - 2018
 * Program to implement a simple Integer Calculator with four operations.
 */

import javax.swing.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerCalculator  extends Frame {
    private static final long serialVersionUID = 1L;

    private TextField tf1;
    private TextField tf2;
    private Label l1;
    private Button bAdd;
    private Button bSub;
    private Button bex;

    private IntegerCalculator() {
        setTitle("Integer Calculator");

        tf1 = new TextField();
        tf1.setBounds(100, 50, 85, 20);

        tf2 = new TextField();
        tf2.setBounds(100, 100, 85, 20);

        bAdd = new Button("Add");
        bAdd.setBounds(152,170, 60, 40);

        bSub = new Button("Sub");
        bSub.setBounds(88,170, 60, 40);

        bex = new Button("Exit");
        bex.setBounds(110, 220,60,40);

        l1 = new Label();
        l1.setBounds(100, 110, 85, 20);

        add(bAdd);
        add(bSub);
        add(bex);
        add(tf1);
        add(tf2);
        add(l1);

        setSize(300, 300);
        this.setLocationRelativeTo(null);

        bAdd.addActionListener((ActionEvent e) -> {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a + b;

                l1.setText("Their sum is = " + String.valueOf(c));
        });

        bSub.addActionListener((ActionEvent e) -> {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a - b;

                l1.setText("Their sum is = " + String.valueOf(c));
        });

        bex.addActionListener((ActionEvent e) -> System.exit(0));
    }

    public static void main(String args[]) {
        IntegerCalculator frame = new IntegerCalculator();
        frame.setVisible(true);
    }
}
