package proxy.implementare;

public class Spital implements ISpital{
    private String denumireSpital;
    // nu am un centralizator, nu am nevoie de camp ptr evidenta vizite


    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
    }

//    @Override
//    public void vizita(String vizitator, String pacient, int oraVizita) {
//        if(verificaOraVizita(oraVizita)){
//            System.out.println("Vizitatorul " +vizitator + " il vizitateaza pe " + pacient + " la ora : " +  oraVizita);
//        }else {
//            System.out.println("Nu s-a prezentat la ora buna");
//        }
//    }

    //varianta noua - fara duplicare
    @Override
    public void vizita(String vizitator, String pacient, int oraVizita) {
        System.out.println("Vizitatorul " +vizitator + " il vizitateaza pe " + pacient + " la ora : " +  oraVizita);
    }

    @Override
    public boolean verificaOraVizita(int oraVizita) {
        return oraVizita >= 14 && oraVizita <= 16;
    }
}
