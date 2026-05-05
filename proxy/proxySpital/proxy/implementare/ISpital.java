package proxy.implementare;

public interface ISpital {
    void vizitare(String vizitator, String pacient);
    void afisareIstoricVizite();

    int getNrVizite(String pacient);
}
