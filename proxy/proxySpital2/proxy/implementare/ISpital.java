package proxy.implementare;

public interface ISpital {
    void vizita(String vizitator, String pacient, int oraVizita);
    boolean verificaOraVizita(int oraVizita); //e ora valabila?

    //Pentru ca proxy-ul să o poată apela pe Spital și să nu duplice logica.
    // Dacă verificaOraVizita ar fi private în Spital,
    // proxy-ul ar trebui să-și aibă propria copie a regulii (14-16) — duplicare.
}
