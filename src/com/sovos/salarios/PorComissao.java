package com.sovos.salarios;

import com.sovos.abs.Employee;

public class PorComissao extends Employee {

    private double salario;
    private double comissao;
    private int vendas;

    public PorComissao(String nome, String familia, double salario, double comissao, int vendas){
        super(nome, familia);
        this.salario = salario + (comissao*vendas);

    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }


    @Override
    public double ganhar() {
        return getSalario();
    }
}
