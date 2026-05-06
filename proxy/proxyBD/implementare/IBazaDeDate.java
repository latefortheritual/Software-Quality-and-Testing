package implementare;

public interface IBazaDeDate {
    void addCuvant(String cuvant, int nrHam, int nrSpam); //operatia pe care vrem sa o optimizam cu bulk
    void afisareCuvinte(); //op ptr verificare, nu intra in optimizare
}
