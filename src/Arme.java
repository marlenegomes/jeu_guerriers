/**
 * Arme est la classe représentant l'arme du guerrier
 *Une arme est caractérisée par:
 * un nom
 * un niveau
 */

public class Arme {

    /**
     * Le nom de l'arme
     */
    private String name;

    /**
     * le niveau de l'arme
     */
    private int niveau;

    /**
     * Constructeur d'une arme
     *
     * @param name
     *  le nom de l'arme
     * @param niveau
     *  le niveau de l'arme
     */
    public Arme(String name, int niveau){
        this.name = name;
        this.niveau = niveau;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * décrit l'arme créée
     * @return une chaine de caractères servant à décrire l'arme
     */
    @Override
    public String toString() {
        return " .J'ai un(e) " + name + " et son niveau est : " + niveau;
    }
}
