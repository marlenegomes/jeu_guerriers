/**
 * Magicien est la classe fille de Personnage
 * Un magicien est caractérisé par:
 * un sort
 * un philtre
 */
public class Magicien extends Personnage {

    /**
     * le philtre du magicien
     */
    private String philtre;

    private final int ViesMin = 3;
    private final int ViesMax = 6;
    private final int Forcemin = 8;
    private final int ForceMax = 15;

    /**
     * contructeur par défaut d'un magicien
     */
    public Magicien() {
    }

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
     * @param attaque
     *  la nouvelle attaque du magicien
     */
    public Magicien(String name, String image, int vies, int force, Attaque attaque) {
        super(name, image, vies, force, attaque);

        }

        @Override
        public int getMinVies () {
            return 3;
        }

        @Override
        public int getMaxVies () {
            return 6;
        }

        @Override
        public int getMinForce () {
            return 8;
        }

        @Override
        public int getMaxForce () {
            return 15;
        }

        public String getPhiltre () {
            return this.philtre;
        }

        public void setPhiltre (String philtre){
            this.philtre = philtre;
        }

        /**
         * décrit le guerrier créé
         * @return une chaine de caractères servant à décrire le guerrier
         */
        @Override
        public String toString () {
            return super.toString() + getAttaque().toString();
        }


    }