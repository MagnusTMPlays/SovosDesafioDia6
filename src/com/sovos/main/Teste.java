package com.sovos.main;

import com.sovos.salarios.Chefe;
import com.sovos.salarios.PorComissao;
import com.sovos.salarios.PorHora;
import com.sovos.salarios.PorItem;
import java.text.DecimalFormat;


public class Teste {
    public static void main(String[] args) {
        Chefe ch = new Chefe("Joao","Silva",555.5);
        PorComissao pc = new PorComissao("Maria","Clara",100,111,556);
        PorItem pi = new PorItem("Hilton","Mello",600,50);
        PorHora ph = new PorHora("Flavia","Souza",50,24);
        DecimalFormat df = new DecimalFormat();

        System.out.println(ch.toString(ch.getNome(), ch.getFamilia()) + " ganha $" + df.format(ch.ganhar()));
        System.out.println(pc.toString(pc.getNome(), pc.getFamilia()) + " ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString(pi.getNome(), pi.getFamilia()) + " ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString(ph.getNome(), ph.getFamilia()) + " ganha $" + df.format(ph.ganhar()));

    }
}
