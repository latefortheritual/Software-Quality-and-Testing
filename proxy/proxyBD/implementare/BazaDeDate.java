package implementare;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDate implements IBazaDeDate{
    private Map<String, Cuvant> bdColectieCuvinte; //cheia e numele cuvantului, iar valoarea e obiectul Cuvant

    public BazaDeDate() {
        this.bdColectieCuvinte = new HashMap<>();
    }


    // Cuvântul există în map?
    //   - NU → creezi Cuvant nou, pui în map
    //   - DA → iei Cuvantul existent, acumulezi (+=) ham și spam
    @Override
    public void addCuvant(String cuvant, int nrHam, int nrSpam) {
        if(!bdColectieCuvinte.containsKey(cuvant)){
            // INSERT — cuvânt nou
            bdColectieCuvinte.put(cuvant,new Cuvant(cuvant,nrHam,nrSpam));
        }else{
            // UPDATE — acumulează valorile la cele existente
            Cuvant existent =  bdColectieCuvinte.get(cuvant);
            existent.setNrHam(existent.getNrHam() + nrHam);
            existent.setNrSpam(existent.getNrSpam() + nrSpam);
        }

    }

    @Override
    public void afisareCuvinte() {
        for(Cuvant c : bdColectieCuvinte.values()){
            System.out.println(c);
        }
        //for (String numeCuvant : bdColectieCuvinte.keySet()) {
        //    System.out.println(bdColectieCuvinte.get(numeCuvant));
        //}
    }
}
