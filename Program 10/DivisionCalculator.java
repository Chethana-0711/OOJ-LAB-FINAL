import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel num1Label = new JLabel("Num 1");
        num1Label.setBounds(30, 30, 50, 30);
        frame.add(num1Label);

        JLabel num2Label = new JLabel("Num 2");
        num2Label.setBounds(30, 70, 50, 30);
        frame.add(num2Label);

        JLabel resultLabel = new JLabel("Result");
        resultLabel.setBounds(30, 110, 50, 30);
        frame.add(resultLabel);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(100, 30, 150, 30);
        frame.add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(100, 70, 150, 30);
        frame.add(num2Field);

        JTextField resultField = new JTextField();
        resultField.setBounds(100, 110, 150, 30);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(100, 150, 100, 30);
        frame.add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
