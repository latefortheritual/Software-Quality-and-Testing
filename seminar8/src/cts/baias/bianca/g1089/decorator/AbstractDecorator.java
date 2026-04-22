package cts.baias.bianca.g1089.decorator;

public abstract class AbstractDecorator implements IBon{
    protected IBon bon;

    public AbstractDecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public Double getTotal() {
        return bon.getTotal();
    }

    @Override
    public void afiseazaTotal() {
        bon.afiseazaTotal();
    }

    @Override
    public void adaugaItem(Double d) {
        bon.adaugaItem(d);
    }

    @Override
    public Persoana getPersoana() {
        return bon.getPersoana();
    }
}
