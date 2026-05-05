package proxy.implementare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySpital implements ISpital{
    private ISpital spital;
   // private Map<String, List<String>> vizite; //Proxy-ul are propriul map de vizite, paralel cu cel din Spital.
    //Restricția zice: "max 2 vizitatori per pacient".
    // Pentru a verifica asta în ProxySpital.vizitare(), proxy-ul trebuie să știe câți vizitatori are deja fiecare pacient.


    public ProxySpital(ISpital spital) {
        this.spital = spital;
     //   this.vizite = new HashMap<>();
    }

//    @Override
//    public void vizitare(String vizitator, String pacient) {
//        //  1. Asigură-te că pacientul există în map-ul propriu (dacă nu, creează lista goală)
//        //  2. Verifică dacă lista pacientului are mai puțin de 2 vizitatori
//        //3. Dacă DA:
//        // - adaugă vizitatorul în lista proprie
//        //  - deleagă către spital.vizitare(...)
//        //4. Dacă NU:
//        // - afișează mesaj de respingere
//
//        if (!vizite.containsKey(pacient)) {
//            vizite.put(pacient, new ArrayList<>());
//        }
//        if (vizite.get(pacient).size() < 2) {
//            vizite.get(pacient).add(vizitator);
//            spital.vizitare(vizitator, pacient); // !!!
//        } else {
//            System.out.println(pacient + " a fost deja vizitat suficient");
//        }
//    }


    @Override
    public int getNrVizite(String pacient) {
        return spital.getNrVizite(pacient);
    }

    @Override
    public void vizitare(String vizitator, String pacient) {
        if(spital.getNrVizite(pacient) < 2){
            spital.vizitare(vizitator,pacient); // !!!
        }else{
            System.out.println(pacient + " a fost deja vizitat suficient");
        }
    }

    @Override
    public void afisareIstoricVizite() {
        spital.afisareIstoricVizite();
    }

}
