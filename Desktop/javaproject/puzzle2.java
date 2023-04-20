
import java.awt.Button;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class z extends Frame {
    Label l1 = new Label("Enter The Age ");
    TextField tf1 = new TextField();
    Button b1 = new Button("Check");
    Button b2 = new Button("Go to next Page");

    z() {
        setVisible(true);
        setSize(800, 600);
        setLayout(null);
        l1.setBounds(50, 100, 120, 30);
        add(l1);
        tf1.setBounds(200, 100, 120, 30);
        add(tf1);
        b1.setBounds(100, 150, 120, 30);
        add(b1);
        b2.setBounds(100, 200, 120, 30);
        add(b2);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String s1 = tf1.getText();
                if (s1.equals(""))
                    JOptionPane.showMessageDialog(null, "Enter the age first");
                int age = Integer.parseInt(s1);
                if (age >= 18)
                    JOptionPane.showMessageDialog(null, "Eligible For Vote");
                else
                    JOptionPane.showMessageDialog(null, "Not Eligible For Vote");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new y().setVisible(true);
                dispose();
            }
        });

    }

    class y extends z {
        Label l1 = new Label("Enter The number ");
        TextField tf1 = new TextField();
        Button b1 = new Button("Check");

        y() {
            setVisible(true);
            setSize(800, 600);
            setLayout(null);
        }
    }

    public static void main(String arg[]) {
        new z();
    }
}