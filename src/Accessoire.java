/**
 * Accessoire est la classe représentant le type d'accesoire du Personnage
 * Un accessoire est caractérisée par un nom.
 */

public abstract class Accessoire {

    private String name;

    /**
     * Constructeur d'un accessoire
     * @param name
     *  le nom de l'accessoire
     */
    public Accessoire(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
