import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operacion {
    private JPanel pnlOperaciones;
    private JTextField textDigito1;
    private JTextField textDigito2;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    int a, b;



    public operacion() {
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables();
                JOptionPane.showMessageDialog(null, "La suma de los números es: " + (a+b));
                textDigito1.setText("");
                textDigito2.setText("");
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables();
                JOptionPane.showMessageDialog(null, "La resta de los números es: " + (a-b));
                textDigito1.setText("");
                textDigito2.setText("");
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables();
                JOptionPane.showMessageDialog(null, "La multiplicacion de los números es: " + (a*b));
                textDigito1.setText("");
                textDigito2.setText("");
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables();
                JOptionPane.showMessageDialog(null, "La división de los números es: " + (a/b));
                textDigito1.setText("");
                textDigito2.setText("");
            }
        });
    }

    public void variables(){
        a = Integer.parseInt(textDigito1.getText());
        b = Integer.parseInt(textDigito2.getText());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Practica 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setContentPane(new operacion().pnlOperaciones);
        frame.pack();
        frame.setVisible(true);

    }
}
