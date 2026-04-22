package cts.baias.bianca.g1089.decorator;

import java.util.ArrayList;
import java.util.List;

public class Bon implements IBon{
    private Persoana p;
    private List<Double> listaItemuri;

    public Bon(Persoana p) {
        this.p = p;
        this.listaItemuri = new ArrayList<>();
    }

    @Override
    public Double getTotal() {
        Double total = 0d;
        for(Double item : listaItemuri){
            total += item;
        }
        return total;
    }

    @Override
    public void afiseazaTotal() {
        System.out.println("Totalul pentru " + p + " este de " + getTotal());
    }

    @Override
    public void adaugaItem(Double d) {
        listaItemuri.add(d);
    }

    @Override
    public Persoana getPersoana() {
        return p;
    }
}
