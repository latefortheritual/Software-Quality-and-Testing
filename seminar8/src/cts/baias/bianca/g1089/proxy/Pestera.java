package cts.baias.bianca.g1089.proxy;

public class Pestera implements IPestera{

    @Override
    public boolean verificareTichet(String vizitator, boolean areTichet) {
        return areTichet;
    }

    @Override
    public void viziteaza(String persoana, boolean areTichet) {
        if(verificareTichet(persoana,areTichet)){
            System.out.println(persoana + "viziteaza");
        }else{
            System.out.println(persoana + "nu are bilet");
        }
    }
}
