package Gimnasio;

import java.time.LocalDate;

public class Cliente {
    private String nombre_completo;
    private String dni;
    private LocalDate facha_nacimiento;
    private String sexo;
    private int altura;
    private Peso[] historico;

    public Cliente(String nombre_completo,LocalDate facha_nacimiento, String dni, String sexo) {
       this.nombre_completo = nombre_completo;
        this.facha_nacimiento = facha_nacimiento;
        this.dni = dni;
        this.sexo = sexo;
    }


    public Cliente(String nombre_completo, String apellidos, String dni, LocalDate facha_nacimiento, String sexo, int altura) {
        this.nombre_completo = nombre_completo;
        this.dni = dni;
        this.facha_nacimiento = facha_nacimiento;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFacha_nacimiento() {
        return facha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAltura() {
        return altura;
    }

    public Peso[] getHistorico() {
        return historico;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }
}
