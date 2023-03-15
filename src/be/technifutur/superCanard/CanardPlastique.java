package be.technifutur.superCanard;

public class CanardPlastique extends Canard {
    public CanardPlastique() {
        super(new NePasVoler(), new Coincoin());
    }

    @Override
    public void afficher() {
        System.out.println("je suis un canard en plastique");
    }
}
