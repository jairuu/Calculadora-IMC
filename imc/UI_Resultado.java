package imc;

import javax.swing.*;

public class UI_Resultado extends JFrame {

    private final JLabel lblIMC;
    private final JLabel lblClasificacion;

    public UI_Resultado(double imc, String clasificacion) {

        setTitle("Resultado del IMC");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lbl1 = new JLabel("Tu IMC es:");
        lbl1.setBounds(30, 40, 150, 30);
        add(lbl1);

        lblIMC = new JLabel(String.format("%.2f", imc));
        lblIMC.setBounds(150, 40, 150, 30);
        add(lblIMC);

        JLabel lbl2 = new JLabel("Clasificación:");
        lbl2.setBounds(30, 90, 150, 30);
        add(lbl2);

        lblClasificacion = new JLabel(clasificacion);
        lblClasificacion.setBounds(150, 90, 200, 30);
        add(lblClasificacion);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBounds(140, 150, 100, 40);
        add(btnCerrar);

        btnCerrar.addActionListener(e -> dispose());
    }
}
