package com.sovos.salarios;

import com.sovos.abs.Employee;

public class PorItem extends Employee {
    private double producao;
    private int quantidade;
    private double salario;

    public PorItem(String nome, String familia, double producao, int quantidade) {
        super(nome, familia);
        this.salario = producao*quantidade;

    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public double ganhar() {
        return getSalario();
    }



}
