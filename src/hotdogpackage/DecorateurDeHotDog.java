package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public abstract class DecorateurDeHotDog extends HotDog {
    public HotDog hdAvecIngredient;

    public DecorateurDeHotDog(HotDog hdai) {
        super();
        hdAvecIngredient = hdai;
    }
}
