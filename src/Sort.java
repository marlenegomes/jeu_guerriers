/**
 * Sort est la classe représentant le sort du Magicien
 *Une arme est caractérisée par:
 * un nom
 * un niveau
 */
public class Sort extends Attaque {

    /**
     * constructeur par défaut d'un sort
     */
    public Sort() {
    }

    /**
     * Constructeur d'un sort
     *
     * @param name
     *  le nom du sort
     * @param niveau
     *  le niveau du sort
     */
    public Sort (String name, int niveau){
       super(name,niveau);
    }


    /**
     * décrit le sort créé
     * @return une chaine de caractères servant à décrire le sort
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
