package com.sovos.salarios;
import com.sovos.abs.Employee;

public class Chefe extends Employee {


    private double salario;

    public Chefe(String nome, String familia,double salario) {
        super(nome, familia);
        this.salario = salario;
    }

    @Override
    public double ganhar() {
        return getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
