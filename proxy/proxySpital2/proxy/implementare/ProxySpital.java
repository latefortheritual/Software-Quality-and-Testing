package proxy.implementare;

import java.util.HashMap;
import java.util.Map;

//Restricția pe care o aplică proxy-ul:
// "Un pacient poate fi vizitat o singură dată" — un pacient = un singur vizitator.
public class ProxySpital implements ISpital{
    private ISpital spital;
    private Map<String, String> vizite; // A mai fost vizitat acest pacient? - vrem sa stim si cine l-a vizitat


    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizite = new HashMap<>();
    }


    //1. Verifică ora prin spital.verificaOraVizita(oraVizita)
    //   - Dacă FALSE → afișează "nu a venit cand trebuie", IEȘI (return)
    //2. Verifică unicitatea: vizite.containsKey(pacient)
    //   - Dacă TRUE → afișează "pacient deja vizitat de ...", IEȘI (return)
    //3. Dacă amândouă au trecut:
    //   - Adaugă în map: vizite.put(pacient, vizitator)
    //   - Deleagă: spital.vizita(vizitator, pacient, oraVizita)
    @Override
    public void vizita(String vizitator, String pacient, int oraVizita) {
        if(!this.verificaOraVizita(oraVizita)){
            System.out.println("Vizitatorul " + vizitator + " nu a venit cand trebuie");
            return;
        }

        if(vizite.containsKey(pacient)){
            System.out.println("Pacientul a mai fost vizitat de " + vizite.get(pacient));
            return;
        }

        vizite.put(pacient, vizitator);
        spital.vizita(vizitator, pacient, oraVizita); // !!!
    }

    @Override
    public boolean verificaOraVizita(int oraVizita) {
        return spital.verificaOraVizita(oraVizita);
    }
}
