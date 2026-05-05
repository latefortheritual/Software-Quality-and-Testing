import proxy.implementare.ISpital;
import proxy.implementare.ProxySpital;
import proxy.implementare.Spital;

//Proxy.
//Avem un spital în care se permite accesul vizitatorilor,
// dacă aceștia declară pacientul vizitat. La nivel de spital există un centralizator al vizitelor.
//În timp, din cauza aglomerației, s-a restricționat accesul la pacienți la nivel de zi,
// de maxim 2 vizitatori per pacient.
//Notă importantă: "proxy nu face treaba" — proxy doar verifică acces, delegă către obiectul real.
// Restricția trebuie aplicată în proxy, dar adăugarea efectivă a vizitei în centralizator rămâne treaba Spital-ului.
//
//Activitate (de rezolvat la final):
//Reimplementare proxy atunci când în interfața ISpital există o metodă care returnează numărul de vizite per pacient.
// Caz: ai deja restricționată vizitarea din clasa Spital.
void main() {
    ISpital spital = new Spital("Floareasca");
    spital.vizitare("Vizitator1", "Pacient1");
    spital.vizitare("Vizitator2", "Pacient1");
    spital.vizitare("Vizitator3", "Pacient1");

    spital.afisareIstoricVizite();

    ISpital spitalRestrictie = new ProxySpital(new Spital("Universitar"));
    spitalRestrictie.vizitare("Vizitator1", "Pacient1");
    spitalRestrictie.vizitare("Vizitator2", "Pacient1");
    spitalRestrictie.vizitare("Vizitator3", "Pacient1");

    spitalRestrictie.afisareIstoricVizite();

}
