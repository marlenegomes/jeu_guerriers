/**
 * Magicien est la classe fille de Personnage
 * Un magicien est caractérisé par:
 * un sort
 * un philtre
 */
public class Magicien extends Personnage {
    /**
     * Le sort du magicien
     * @see Sort#Sort(String, int)
     */
    private Sort sort;

    /**
     * le philtre du magicien
     */
    private String philtre;

    /**
     * Constructeur de magicien
     *
     *
     * @param name
     *  le nouveau nom du magicien
     * @param image
     *  la nouvelle image du magicien
     * @param vies
     *  le nouveau de vies du magicien
     * @param force
     *  La nouvelle force du magicien
     * @param sort
     *  le nouveau sort du magicien
     */
    public Magicien(String name, String image, int vies, int force, Sort sort) {
        //super : pour faire appel aux attributs de la classe mère personnage
        super(name,image, vies, force);
        this.sort = sort;
    }

    public Sort getSort() {
        return this.sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public String getPhiltre() {
        return this.philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    /**
     * décrit le guerrier créé
     * @return une chaine de caractères servant à décrire le guerrier
     */
    @Override
    public String toString() {
        return super.toString() + this.sort.toString();
    }
}
