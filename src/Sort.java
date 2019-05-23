/**
 * Sort est la classe représentant le sort du Magicien
 *Une arme est caractérisée par:
 * un nom
 * un niveau
 */
public class Sort {

    /**
     * Le nom du sort
     */
    private String name;

    /**
     * le niveau du sort
     */
    private int niveau;

    /**
     * Constructeur d'un sort
     *
     * @param name
     *  le nom du sort
     * @param niveau
     *  le niveau du sort
     */
    public Sort (String name, int niveau){
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
     * décrit le sort créé
     * @return une chaine de caractères servant à décrire le sort
     */
    @Override
    public String toString() {
        return " .J'ai un sort: " + name + "dont le niveau est : " + niveau;
    }
}
