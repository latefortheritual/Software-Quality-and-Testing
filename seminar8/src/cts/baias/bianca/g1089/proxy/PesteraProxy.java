package cts.baias.bianca.g1089.proxy;

import java.util.ArrayList;
import java.util.List;

public class PesteraProxy implements IPestera{
    private IPestera pestera;
    private List<String> listaAsteptare;

    public PesteraProxy(IPestera pestera) {
        this.pestera = pestera;
        this.listaAsteptare = new ArrayList<>();
    }

    @Override
    public boolean verificareTichet(String vizitator, boolean areTichet) {
        return pestera.verificareTichet(vizitator, areTichet);
    }

    @Override
    public void viziteaza(String persoana, boolean areTichet) {
        if(pestera.verificareTichet(persoana, areTichet)){
            listaAsteptare.add(persoana);
            if(listaAsteptare.size() == 5){
                for(String p : listaAsteptare){
                    pestera.viziteaza(p,true);
                }
                listaAsteptare.clear();
            }
        }else{
            System.out.println(persoana + "nu are tichet");
        }
    }
}
