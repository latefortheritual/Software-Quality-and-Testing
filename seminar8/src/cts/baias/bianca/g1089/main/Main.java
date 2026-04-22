import cts.baias.bianca.g1089.decorator.Bon;
import cts.baias.bianca.g1089.decorator.DecoratorReducere;
import cts.baias.bianca.g1089.decorator.IBon;
import cts.baias.bianca.g1089.decorator.Persoana;
import cts.baias.bianca.g1089.proxy.IPestera;
import cts.baias.bianca.g1089.proxy.Pestera;
import cts.baias.bianca.g1089.proxy.PesteraProxy;

void main() {
    // o Pestera -> persoana care are tichet cumparat, poate vizita direct pestera
    // Dupa ceva timp, s-a adaugat o restrictie, vizitarea se face in set de 10 persoane primite de ghid.
    // Se va folosi o lista de asteptare

    IPestera pestera = new Pestera();
    IPestera pesteraProxy = new PesteraProxy(pestera);

    pesteraProxy.viziteaza("Bianca", true);
    pesteraProxy.viziteaza("Bianca2", true);
    pesteraProxy.viziteaza("Bianca3", false);
    pesteraProxy.viziteaza("Bianca4", true);
    pesteraProxy.viziteaza("Bianca5", true);
    pesteraProxy.viziteaza("Bianca6", true);

    // Suntem intr-un context de restaurant. La incheierea comenzii se calculeaza totalul si se afiseaza pe bon
    // Pe perioada primaverii, femeile au o reducere de 10% pentru fiecare bon care a fost generat.

    Persoana Maria = new Persoana("feminin");
    Persoana Ion = new Persoana("masculin");

    IBon bon = new Bon(Maria);
    bon.adaugaItem(100.0);
    bon.afiseazaTotal();

    IBon bon1 = new DecoratorReducere(new Bon(Maria));
    bon1.adaugaItem(100.0);
    bon1.afiseazaTotal();

    IBon bon2 = new DecoratorReducere(new Bon(Ion));
    bon2.adaugaItem(100.0);
    bon2.afiseazaTotal();
}
