import proxy.implementare.ISpital;
import proxy.implementare.ProxySpital;
import proxy.implementare.Spital;

//Avem un spital în care vizitatorii pot vizita pacienți la o anumită oră.
// Vizitele sunt permise doar într-un interval orar (14-16).
//Restricție adițională: un pacient poate fi vizitat o singură dată (nu de mai mulți vizitatori diferiți).
//Implementați Proxy pentru a aplica restricția de unicitate.
//Activitate: "Cum putem să nu verificăm de 2 ori ora de vizită?"
// (problemă de design — duplicarea verificării între Spital și Proxy).
void main() {
    ISpital spital = new Spital("Floareasca");
    spital.vizita("vizitator1", "pacient", 10);
    spital.vizita("vizitator1", "pacient", 14);
    spital.vizita("vizitator2", "pacient", 15);

    ISpital proxySpital = new ProxySpital(new Spital("Universitar"));
    proxySpital.vizita("vizitator1 proxy", "pacient proxy", 16);
    proxySpital.vizita("vizitator2 proxy", "pacient proxy", 16);

    //Activitatea — "cum putem să nu verificăm de 2 ori ora de vizită?"
    // Recap problemaOra se verifică în 2 locuri:
    //
    //ProxySpital.vizita() apelează verificaOraVizita(oraVizita) (deleagă către spital) → decide dacă deleagă mai departe
    //Spital.vizita() apelează verificaOraVizita(oraVizita) în interior → decide dacă afișează


    //Proxy = "doar restricția adăugată, restul e treaba spitalului"
    //Spital își păstrează regulile intrinseci (ora 14-16), proxy adaugă doar restricția nouă (unicitatea)
    proxySpital.vizita("vizitator3 proxy", "pacient nou", 10);
}
