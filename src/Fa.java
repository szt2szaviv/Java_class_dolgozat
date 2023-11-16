/**vízre van szüksége, ha a jelenlegi vízmennyisége kevesebb, mint 10
a fa öntözéskor csak a víz 40%-át tudja felvenni.
pl. 10-es öntözés esetén a fa vízmennyisége csak 4 %-kal nőhet.**/

public class Fa {
    private String fajta;
    private double viz;
    private Kert kertAllapot;
    private Kert ontoz;

    public Fa(String fajta,double viz, Kert kertAllapot, Kert ontoz){
        this.fajta = fajta;
        this.viz = viz;
        this.kertAllapot = kertAllapot;
        this.ontoz = ontoz;
    }

    public String Fajta(){
        return fajta;
    }

    public double Viz(){
        return viz;
    }

    public Kert KertAllapot(){
        return kertAllapot;
    }

    public Kert Ontoz(){
        return ontoz;
    }


}
