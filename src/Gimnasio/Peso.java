package Gimnasio;

import java.time.LocalDate;

public class Peso {

    private double peso;
    private LocalDate fecha_hoy;
    private double peso_ajustado;
    private double metabolico_basal;
    private Imc IMC;


    public Peso(double peso, LocalDate fecha_hoy) {
        this.peso = peso;
        this.fecha_hoy = fecha_hoy;
    }


    public double alturaDouble(Cliente cliente) {

        double altura = cliente.getAltura() / 100.0;
        return altura;
    }


    public void calcularImc(Cliente cliente, double peso) {
        double altura = alturaDouble(cliente.getAltura());

       double imc = peso/(altura^2);

    }


}



