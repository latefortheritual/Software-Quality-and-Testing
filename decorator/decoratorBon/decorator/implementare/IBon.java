package decorator.implementare;

public interface IBon {
    void adaugaProdus(float pret);
    float calculeazaTotalul(); // suma bruta a produselor
    void printeazaBonul();

    float getTotalDePlata(); // ce plateste clientul
}
