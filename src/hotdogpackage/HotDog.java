package hotdogpackage;

/**
 * Created by melvin on 16/06/17.
 */
public abstract class HotDog {
    private String nom;
    private String description;

    public HotDog() {}

    public HotDog(String n, String d) {
        setNom(n);
        setDescription(d);
    }

    abstract public double prixTotal();

    abstract public void fabriqueToi();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
