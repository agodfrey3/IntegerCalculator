/* Andrew Godfrey
 * Software Engineering
 * 1 - 31 - 2018
 * Program to implement a simple Integer Calculator with four operations.
 */

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class IntegerCalculator  extends Frame {
    private static final long serialVersionUID = 1L;

    private TextField tf1;
    private TextField tf2;
    private Label l1;
    private Button bAdd, bSub, bMult, bDiv, bex;
    private DecimalFormat df;

    // Main method for handling all functionality.
    private IntegerCalculator() {
        // Ensures that the output only contains one decimal place.
        df = new DecimalFormat(".#");

        ////////////////////////////////////////////////////////////
        // Sets up the GUI.
        ////////////////////////////////////////////////////////////
        setSize(270, 200);
        this.setLocationRelativeTo(null);

        setTitle("Integer Calculator");

        tf1 = new TextField();
        tf1.setBounds(25, 50, 85, 20);

        tf2 = new TextField();
        tf2.setBounds(25, 100, 85, 20);

        bAdd = new Button("Add");
        bAdd.setBounds(115,45, 60, 40);

        bSub = new Button("Sub");
        bSub.setBounds(180,45, 60, 40);

        bMult = new Button("Mult");
        bMult.setBounds(115,95, 60, 40);

        bDiv = new Button("Div");
        bDiv.setBounds(180,95, 60, 40);

        bex = new Button("Exit");
        bex.setBounds(180, 145,60,40);

        l1 = new Label();
        setLayout(null);
        l1.setBounds(15, 150, 130, 20);

        add(bAdd);
        add(bSub);
        add(bMult);
        add(bDiv);
        add(bex);
        add(tf1);
        add(tf2);
        add(l1);

        ////////////////////////////////////////////////////////////
        // Enables user actions and gracefully handles errors.
        ///////////////////////////////////////////////////////////

        bAdd.addActionListener((ActionEvent e) -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                double c = a + b;

                l1.setText("Their sum is = " + df.format(c));
            } catch (Exception NumberFormatException) {
                l1.setText("Invalid input.");
            }
        });

        bSub.addActionListener((ActionEvent e) -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                double c = a - b;

                l1.setText("Their dif is = " + df.format(c));
            } catch (Exception NumberFormatException) {
                l1.setText("Invalid input.");
            }
        });

        bMult.addActionListener((ActionEvent e) -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                double c = a * b;

                l1.setText("Their product is = " + df.format(c));
            } catch (Exception NumberFormatException) {
                l1.setText("Invalid input.");
            }
        });

        bDiv.addActionListener((ActionEvent e) -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                double c = a / b;

                l1.setText("The quotient is = " + df.format(c));
            } catch (Exception NumberFormatException) {
                l1.setText("Invalid input.");
            }
        });

        bex.addActionListener((ActionEvent e) -> System.exit(0));
    }

    public static void main(String args[]) {
        IntegerCalculator frame = new IntegerCalculator();
        frame.setVisible(true);
    }
}
