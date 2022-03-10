package com.sovos.abs;

public abstract class Employee {

    private String nome;
    private String familia;


    public abstract double ganhar();

    public Employee(String nome,String familia){
        this.nome = nome;
        this.familia = familia;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String toString(String nome ,String familia) {
        return nome + ' ' + familia;
    }

}
