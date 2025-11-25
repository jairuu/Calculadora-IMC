package imc;

import javax.swing.*;

public class UI_IMC extends JFrame {

    private final JTextField txtPeso;
    private final JTextField txtEstatura;

    public UI_IMC() {

        setTitle("Calculadora de IMC - Hospital CDMX");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbl1 = new JLabel("Peso (kg):");
        lbl1.setBounds(30, 40, 150, 30);
        add(lbl1);

        txtPeso = new JTextField();
        txtPeso.setBounds(150, 40, 150, 30);
        add(txtPeso);

        JLabel lbl2 = new JLabel("Estatura (m):");
        lbl2.setBounds(30, 90, 150, 30);
        add(lbl2);

        txtEstatura = new JTextField();
        txtEstatura.setBounds(150, 90, 150, 30);
        add(txtEstatura);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.setBounds(120, 160, 150, 40);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcular());
    }

    private void calcular() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            double estatura = Double.parseDouble(txtEstatura.getText());

            Paciente p = new Paciente(peso, estatura);
            double imc = p.calcularIMC();
            String clasificacion = CalculadoraIMC.clasificarIMC(imc);

            UI_Resultado resultado = new UI_Resultado(imc, clasificacion);
            resultado.setVisible(true);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos. Verifica los valores.");
        }
    }
}