package imc;

public class Paciente {
    private final double peso;
    private final double estatura;

    public Paciente(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }
}
