/**
 * Guerrier est la classe fille de Personnage
 * Un guerrier est caractérisé par:
 * une arme
 * un bouclier
 */
public class Guerrier extends Personnage {

    /**
     * L'arme du guerrier
     * @see Arme#Arme(String, int)
     */
    private Arme arme;

    /**
     * le bouclier du personnage
     */
    private String bouclier;


    //constructeur 3 avec plusieurs paramètres

    /**
     * Constructeur de Guerrier
     *
     * @param name
     *  Le nom du Guerrier
     * @param image
     *  L'image du guerrier
     * @param vies
     *  Le niveau de vies du guerrier
     * @param force
     *  La force du guerrier
     * @param arme
     *  L'arme du guerrier
     */
    public Guerrier(String name, String image, int vies, int force, Arme arme) {
        super(name, image, vies, force);
        this.arme = arme;

    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public Arme getArme() {
        return this.arme;
    }

    public String getBouclier() {
        return this.bouclier;
    }

    /**
     * décrit le magicien
     * @return une chaine de caractères servant à décrire le magicien
     */
    @Override
    public String toString() {
        return super.toString() + this.arme.toString();
    }
}
