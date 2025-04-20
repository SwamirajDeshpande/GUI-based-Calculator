import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton add, sub, mul, div;
    JLabel result;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 400);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        l1 = new JLabel("First Number:");
        l1.setBounds(10, 20, 100, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        add(t1);

        l2 = new JLabel("Second Number: ");
        l2.setBounds(10, 50, 100, 20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        add(t2);

        add = new JButton("+");
        add.setBounds(10, 80, 50, 30);
        add(add);

        sub = new JButton("-");
        sub.setBounds(70, 80, 50, 30);
        add(sub);

        mul = new JButton("*");
        mul.setBounds(130, 80, 50, 30);
        add(mul);

        div = new JButton("/");
        div.setBounds(190, 80, 50, 30);
        add(div);

        result = new JLabel("Result");
        result.setBounds(10, 120, 180, 20);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                result.setText("Result: " + c);
            }
            if (e.getSource() == div) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                if (b == 0) {
                    result.setText("Can't divide by zero");
                } else {
                    int c = a / b;
                    result.setText("Result: " + c);
                }
            }
        } catch (Exception e1) {
            result.setText("enter number as integer values");
        }
    }

    public static void main(String args[]) {
        Calculator f = new Calculator();
    }
}