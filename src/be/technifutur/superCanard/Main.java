package be.technifutur.superCanard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Canard> mare = Arrays.asList(
                new Colvert(),
                new Mandarin(),
                new CanardPlastique(),
                new Leurre(),
                new CanardEnPlastiqueMuet()
        );

        for (Canard c : mare){
            System.out.println("~~~~~~~~~~~~~~~");
            c.afficher();
            c.nager();
            c.setComportementDeCancan(new Begayer(c.getComportementDeCancan()));
            c.effectuerCancan();
            c.effectuerVol();
        }
    }


}
