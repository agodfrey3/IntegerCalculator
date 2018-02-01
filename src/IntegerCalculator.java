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
    private Button bAdd, bSub, bMult, bDiv, bex;

    private IntegerCalculator() {
        setSize(300, 370);
        this.setLocationRelativeTo(null);

        setTitle("Integer Calculator");

        tf1 = new TextField();
        tf1.setBounds(15, 50, 85, 20);

        tf2 = new TextField();
        tf2.setBounds(15, 100, 85, 20);

        bAdd = new Button("Add");
        bAdd.setBounds(105,45, 60, 40);

        bSub = new Button("Sub");
        bSub.setBounds(170,45, 60, 40);

        bMult = new Button("Mult");
        bMult.setBounds(105,95, 60, 40);

        bDiv = new Button("Div");
        bDiv.setBounds(170,95, 60, 40);

        bex = new Button("Exit");
        bex.setBounds(170, 145,60,40);

        l1 = new Label();
        setLayout(null);
        l1.setBounds(15, 150, 120, 20);

        add(bAdd);
        add(bSub);
        add(bMult);
        add(bDiv);
        add(bex);
        add(tf1);
        add(tf2);
        add(l1);

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

                l1.setText("Their difference is = " + String.valueOf(c));
        });

        bMult.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            int c = a * b;

            l1.setText("Their product is = " + String.valueOf(c));
        });

        bDiv.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            int c = a / b;

            l1.setText("The quotient is = " + String.valueOf(c));
        });

        bex.addActionListener((ActionEvent e) -> System.exit(0));
    }

    public static void main(String args[]) {
        IntegerCalculator frame = new IntegerCalculator();
        frame.setVisible(true);
    }
}
