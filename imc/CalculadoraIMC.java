package imc;

public class CalculadoraIMC {

    public static String clasificarIMC(double imc) {

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidad grado I";
        } else if (imc < 39.9) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }
    }
}
