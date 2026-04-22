package cts.baias.bianca.g1089.decorator;

public class DecoratorReducere extends AbstractDecorator{
    public DecoratorReducere(IBon bon) {
        super(bon);
    }

    @Override
    public Double getTotal() {
        Double total = bon.getTotal();
        if(bon.getPersoana().getGen().equals("feminin")){
            total =  0.9 * total;
        }
        return total;
    }

    @Override
    public void afiseazaTotal() {
        System.out.println("Persoana " + bon.getPersoana() + " are totalul de " + getTotal());
    }


}
