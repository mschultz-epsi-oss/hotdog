package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public class HotDogBase extends HotDog {

    public HotDogBase(String n, String d) {
        super(n, d);
    }

    @Override
    public double prixTotal() {
        return 2.80;
    }

    @Override
    public void fabriqueToi() {
        System.out.println("Nom: " + getNom());
        System.out.println("Description: " + getDescription());
        System.out.println("Prix: " + prixTotal() + "€");
    }
}
