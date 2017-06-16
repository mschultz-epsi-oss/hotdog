package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public class MoutardeCidre extends DecorateurDeHotDog {
    private String typeIngredient;

    public MoutardeCidre(HotDog hdai) {
        super(hdai);
        typeIngredient = "moutarde cidre";
    }

    @Override
    public double prixTotal() {
        return hdAvecIngredient.prixTotal() + 0.50;
    }

    @Override
    public void fabriqueToi() {
        hdAvecIngredient.fabriqueToi();
        fabriqueToiAvecIngredient();
        System.out.println("Prix: " + prixTotal() + "€");
    }

    public void fabriqueToiAvecIngredient() {
        System.out.println("Ingredient ajouté : " + typeIngredient);
    }
}
