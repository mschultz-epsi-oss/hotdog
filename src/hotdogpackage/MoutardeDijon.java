package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public class MoutardeDijon extends DecorateurDeHotDog {
    private String typeIngredient;

    public MoutardeDijon(HotDog hdai) {
        super(hdai);
        typeIngredient = "moutarde de dijon";
    }

    @Override
    public double prixTotal() {
        return hdAvecIngredient.prixTotal() + 0.20;
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
