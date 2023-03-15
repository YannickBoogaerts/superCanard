package be.technifutur.superCanard;

public abstract class Canard {
    private ComportementDeCancan comportementDeCancan;
    private ComportementDeVol comportementDeVol;

    public void setComportementDeCancan(ComportementDeCancan comportementDeCancan) {
        this.comportementDeCancan = comportementDeCancan;
    }

    public void setComportementDeVol(ComportementDeVol comportementDeVol) {
        this.comportementDeVol = comportementDeVol;
    }

    public Canard(ComportementDeVol vol, ComportementDeCancan cancan) {
        comportementDeVol = vol;
        comportementDeCancan = cancan;
    }

    public abstract void afficher();

    public void nager() {
        System.out.println("plouf plouf");
    }

    public void effectuerCancan() {
        this.comportementDeCancan.cancaner();
    }

    public void effectuerVol() {
        this.comportementDeVol.voler();
    }

    public ComportementDeCancan getComportementDeCancan() {
        return comportementDeCancan;
    }

    public ComportementDeVol getComportementDeVol() {
        return comportementDeVol;
    }
}
