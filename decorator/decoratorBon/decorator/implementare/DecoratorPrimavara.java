package decorator.implementare;

public class DecoratorPrimavara extends AbstractDecorator{

    public DecoratorPrimavara(IBon bon) {
        super(bon);
        if(bon instanceof DecoratorPrimavara){
            throw new IllegalArgumentException("Nu se poate aplica DecoratorPrimavara peste DecoratorPrimavara");
        }
    }

    @Override
    public float getTotalDePlata() {
            return 0.9f * super.getTotalDePlata();
    }

    @Override
    public void printeazaBonul() {
        System.out.println("*************");

        super.printeazaBonul(); // afișează bonul cu totalul brut
            System.out.println("Discount aplicat: 10%");
            System.out.println("Total de plată: " + this.getTotalDePlata());

    }
}
