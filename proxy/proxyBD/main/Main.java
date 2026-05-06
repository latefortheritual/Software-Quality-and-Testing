import implementare.BazaDeDate;
import implementare.IBazaDeDate;
import implementare.ProxyBazaDeDate;

//Sa se modeleze folosind DP Proxy conceptul de Bulk insert, atunci cand se adauga un nivel intermediar
//de interactiune cu BD in care se agrega local toate actualizarile din Baza de date si apoi se varsa toate ulterior in BD
//Procesul obtine un timp de executare optimizat a comenzilor insert si update
void main() {
    IBazaDeDate bazaDeDate = new ProxyBazaDeDate(new BazaDeDate());

    // primele 10 apeluri → declanșează primul flush
    bazaDeDate.addCuvant("car", 0, 1);
    bazaDeDate.addCuvant("car", 1, 1);
    bazaDeDate.addCuvant("car", 2, 1);
    bazaDeDate.addCuvant("car", 3, 1);
    bazaDeDate.addCuvant("car", 4, 1);
    bazaDeDate.addCuvant("word", 5, 1);
    bazaDeDate.addCuvant("word", 6, 1);
    bazaDeDate.addCuvant("word", 7, 1);
    bazaDeDate.addCuvant("word", 7, 1);
    bazaDeDate.addCuvant("word", 7, 1);

    // mai adăugăm încă apeluri (n-ajung la 10 → rămân în buffer)
    bazaDeDate.addCuvant("cat", 7, 1);
    bazaDeDate.addCuvant("cat", 7, 1);
    bazaDeDate.addCuvant("cat", 7, 1);

    // afișăm doar ce e în BD reală
    bazaDeDate.afisareCuvinte();
}
