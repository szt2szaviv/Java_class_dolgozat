/**vízre van szüksége, ha a jelenlegi vízmennyisége kevesebb, mint 5
a virág öntözéskor a víznek csak 75%-át tudja felvenni.
pl. 10-es öntözés esetén a virág vízmennyiségének csak 7,5 %-kal kell növekednie.**/

public class Virag {

    private String szin;

    private double viz;
    private Kert kertAllapot;
    private Kert ontoz;

    public Virag(String szin, double viz, Kert kertAllapot, Kert ontoz){
        this.szin = szin;
        this.viz = viz;
        this.kertAllapot = kertAllapot;
        this.ontoz = ontoz;
    }

    public String Szin(){
        return szin;
    }
    public double Viz(){
        return viz;
    }
    public void KertAllapot(){
        System.out.println("A/Az " + szin +" virágnak " + ontoz + " szüksége vízre.");
    }
    public String Ontoz(String v, String n) {
        if (viz == 5 || viz > 5) {
            n = "nincs";
            return n;
        }else {
            v = "van";
            return v;
        }
    }
}
