package implementare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyBazaDeDate implements IBazaDeDate{
    private IBazaDeDate bazaDeDate;
    private int contor; // nr de apeluri acumulate
    // cheia e numele cuvantului, iar valoarea e o lista cu cele 3 elem: nrHam, nrSpam
    private Map<String, List<Integer>> colectieCuvinte; //buffer local ptr agregare
    //se agregă local toate actualizările din Baza de date și apoi se varsă toate ulterior în BD" - local = in proxy

    //Proxy-ul ține propriul map cu cuvintele care au fost cerute, dar care nu au fost încă scrise în BD reală.
    // Când contorul ajunge la 10, varsă tot map-ul în BD și îl resetează.


    public ProxyBazaDeDate(IBazaDeDate bazaDeDate) {
        this.bazaDeDate = bazaDeDate;
        this.contor = 0;
        this.colectieCuvinte = new HashMap<>();
    }

    @Override
    public void addCuvant(String cuvant, int nrHam, int nrSpam) {
        contor ++;

        if(!colectieCuvinte.containsKey(cuvant)){
            //cuvant nou in buffer -> creeaza o lista cu ham,spam
            List<Integer> list = new ArrayList<>();
            list.add(nrHam);
            list.add(nrSpam);
            colectieCuvinte.put(cuvant,list);
        } else{
            //cuvant existent -> acumuleaza la lista existenta
            List<Integer> list = colectieCuvinte.get(cuvant);
            list.set(0, list.get(0) + nrHam);   // poziția 0 = ham
            list.set(1, list.get(1) + nrSpam);  // poziția 1 = spam
        }

        if(contor == 10){
            for(String c : colectieCuvinte.keySet()){
                List<Integer> list = colectieCuvinte.get(c);
                bazaDeDate.addCuvant(c,list.get(0), list.get(1));
            }
            contor = 0;
            colectieCuvinte.clear();
        }

    }

    @Override
    public void afisareCuvinte() {
        bazaDeDate.afisareCuvinte();
    }
}
