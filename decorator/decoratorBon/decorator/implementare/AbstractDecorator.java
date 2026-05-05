package decorator.implementare;

public abstract class AbstractDecorator implements IBon {
    private IBon bon;

    public AbstractDecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public void adaugaProdus(float pret) {
        bon.adaugaProdus(pret);
    }

    @Override
    public float calculeazaTotalul() {
        return bon.calculeazaTotalul();
    }

    @Override
    public void printeazaBonul() {
        bon.printeazaBonul();
    }

    @Override
    public float getTotalDePlata() {
        return bon.getTotalDePlata();
    }
}
