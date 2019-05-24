/**
 * Guerrier est la classe fille de Personnage
 * Un guerrier est caractérisé par:

 * un bouclier
 */
public class Guerrier extends Personnage {

    /**
     * le bouclier du personnage
     */
    private String bouclier;
    /**
     * le nombre minimum de vies du personnage. Constante
     */
    private final int ViesMin = 5;

    /**
     * le nombre maximum de vies du personnage. Constante
     */
    private final int ViesMax = 10;

    /**
     * le niveau minimum de force du personnage. Constante
     */
    private final int Forcemin = 5;

    /**
     * le niveau maximum de force du personnage. Constante
     */
    private final int ForceMax = 10;

    /**
     * constructeur par défaut d'un guerrier
     */
    public Guerrier() {
    }

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
     * @param attaque
     *  L'arme du guerrier
     */
    public Guerrier(String name, String image, int vies, int force, Attaque attaque){
            super(name, image, vies, force, attaque);
    }

    @Override
    public int getMinVies() {
        return 5;
    }

    @Override
    public int getMaxVies() {
        return 10;
    }

    @Override
    public int getMinForce() {
        return 5;
    }

    @Override
    public int getMaxForce() {
        return 10;
    }



    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
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
        return super.toString() + getAttaque().toString();
    }



}
