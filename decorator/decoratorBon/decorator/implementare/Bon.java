package decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Bon implements IBon{
    private int id;
    private List<Float> listaPreturiProduse;

    public Bon(int id) {
        this.id = id;
        this.listaPreturiProduse = new ArrayList<>();
    }

    @Override
    public void adaugaProdus(float pret) {
        listaPreturiProduse.add(pret);
    }

    @Override
    public float calculeazaTotalul() {
        float total = 0;
        for(Float p : listaPreturiProduse){
            total += p;
        }
        return total;
    }

    @Override
    public void printeazaBonul() {
        System.out.println("Bon nr. " + this.id);
        for (Float p : listaPreturiProduse) {
            System.out.println("Produs: " + p);
        }
        System.out.println("Total: " + this.calculeazaTotalul());
    }

    @Override
    public float getTotalDePlata() {
        return this.calculeazaTotalul();
    }
}
