package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public class HotDogMeuh extends HotDog {

    public HotDogMeuh(String n, String d) {
        super(n, d);
    }

    @Override
    public double prixTotal() {
        return 3.50;
    }

    @Override
    public void fabriqueToi() {
        System.out.println("Nom: " + getNom());
        System.out.println("Description: " + getDescription());
        System.out.println("Prix: " + prixTotal() + "€");
    }
}
