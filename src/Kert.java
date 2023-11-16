/**korlátlan mennyiségű virágot és fát képes tartani (ezek mind növények).
öntözéskor csak azokat a növényeket kell öntözni, amelyeknek vízre van szükségük, egyenlően elosztva a mennyiséget közöttük.
pl. 40 növényt öntözünk, és 4 növénynek van szüksége vízre, akkor mindegyik 10-et kap.
A virágok és fák a közös tulajdonságaikat a növeny osztályról öröklik.
A kert osztálynak van
kertAllapot() metódusa, mely kiírja a kertveb található virágok és fák állapotát
ontoz() metódusa, növeli a növények vízmennyiségét az adott szabályok szerint**/

public class Kert {

    private String kertAllapot;
    private double ontoz;

    public Kert(String kertAllapot, double ontoz){
        this.kertAllapot = kertAllapot;
        this.ontoz = ontoz;
    }

    public String KertAllapot(){
        return kertAllapot;
    }

    public double Onzot(){
        return ontoz;
    }
}
