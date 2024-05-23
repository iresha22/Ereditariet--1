public class Animale {
    @Override
    public String toString() {
        return "Animale{" +
                "gatto='" + gatto + '\'' +
                ", cane='" + cane + '\'' +
                ", cavallo='" + cavallo + '\'' +
                ", elefante='" + elefante + '\'' +
                '}';
    }

    String gatto = "Meow ";
        String cane = "Abbaiare";
        String cavallo = "Nitrire";
        String elefante = "Barrire";

    public  String FaiIlVerso(String gatto,String cane,String cavallo,String elefante) {
        this.gatto = gatto;
        this.cane = cane;
        this.cavallo = cavallo;
        this.elefante = elefante;
        return gatto + cane + cavallo + elefante;
    }

}
