//O casă de marcat (Bon) generează totalul de plată ca sumă a produselor și printează bonul.
//Pe perioada primăverii, bonurile emise femeilor conțin o reducere de 10%.
//Asta nu e o restricție — indiferent de gen tot vor avea bon.
// Reducerea se aplică doar pe perioada primăverii, iar la printare se va completa cu o linie cu steluțe.

import decorator.implementare.Bon;
import decorator.implementare.DecoratorPrimavara;
import decorator.implementare.IBon;//Activități (de rezolvat):
//
//De corectat inconsistența dintre printare() și getTotal() pentru genul feminin. Propunere: câmp suplimentar discount / totalBon.
//De propus / implementat alte soluții pentru identificarea genului — cum altfel pot primi un boolean?
//De implementat modificări astfel încât să nu pot aplica DecoratorPrimavara peste DecoratorPrimavara (adică reducere peste reducere).
void main() {

    IBon bon = new Bon(1);
    bon.adaugaProdus(10);
    bon.printeazaBonul();
    System.out.println("---------------------------------");

    IBon bonFemeie = new DecoratorPrimavara(new Bon(2));
    bonFemeie.adaugaProdus(100);
    bonFemeie.printeazaBonul();
    //System.out.println("Total returnat de getTotal: " + bonDecorat.calculeazaTotalul());
    System.out.println("---------------------------------");

    IBon bonBarbat = new Bon(3);
    bonBarbat.adaugaProdus(50);
    bonBarbat.printeazaBonul();

    System.out.println("---------------------------------");
    try{
        IBon bonDublu = new DecoratorPrimavara(new DecoratorPrimavara(new Bon(4))); //trebuie sa impiedic decorarea dubla
        bonDublu.adaugaProdus(100);
        bonDublu.printeazaBonul();
    }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }

}
