package proxy.implementare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spital implements ISpital{
    private String denumireSpital; //identificator
    private Map<String, List<String>> vizite; // cheia e pacientul, valoare e lista de vizitatori
    //operatie rapida: cati vizitatori are pacientul X?


    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
        this.vizite = new HashMap<>();
    }

    @Override
    public void vizitare(String vizitator, String pacient) {
        System.out.println(vizitator + " l-a vizitat pe " + pacient);
        //cand primesc un vizitator nou ptr un pacient sunt posibile 2 situatii:cand exista si nu exista pacientul
        //Spital nu stie nimic despre restrictii, proxy controleaza accesul

        //pacientul(cheia) nu exista inca in map -> trb sa creezi o lista goala ptr el
        if(!vizite.containsKey(pacient)){
            vizite.put(pacient, new ArrayList<>());
        }
        //pacientul exista deja -> adaugi direct vizitatorul in lista lui
        vizite.get(pacient).add(vizitator);
    }

    @Override
    public void afisareIstoricVizite() {
        System.out.println("Istoric vizite " + this.denumireSpital);
        for(String pacient : vizite.keySet()){
            System.out.println("Pacient: " + pacient);
            System.out.println("Vizitatori:");
            for(String vizitator : vizite.get(pacient)){
                System.out.println(" - " + vizitator);
            }
        }
    }

    @Override
    public int getNrVizite(String pacient) {
        if(!vizite.containsKey(pacient)){
            return 0;
        }
        return vizite.get(pacient).size();
    }
}
