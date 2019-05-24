/**
 * Arme est la classe fille de la classe Attaque.
 * Cette classe représente l'arme du guerrier.
 *Une arme est caractérisée par:
 * un nom
 * un niveau.
 */

public class Arme extends Attaque {

    /**
     * constructeur par défaut d'une arme
     */
    public Arme() {
    }

    /**
     * Constructeur d'une arme
     *
     * @param name
     *  le nom de l'arme,
     * @param niveau
     *  le niveau de l'arme
     */
    public Arme(String name, int niveau){
        super(name, niveau);
    }

    /**
     * décrit l'arme créée
     * @return une chaine de caractères servant à décrire l'arme
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
