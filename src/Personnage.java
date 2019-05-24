import java.util.List;

/**
 * Personnage est la classe représentant un personnage du jeu
 * Un personnage est caractérisé par les propriétés suivantes:
 * un nom, qui peut être modifié par l'utilisateur
 * une image
 * un niveau de vies, qui peut être modifié par l'utilisateur
 * un niveau de force, qui peut être modifié par l'utilisateur
 *
 * @author marlenegomes
 */

public abstract class Personnage {

    /**
     * le nom du personnage. Modifiable
     *
     * @see Personnage#getName()
     * @see Personnage#setName(String)
     */
    private String name;
    private String image;

    /**
     * le niveau de vies du personnage. Modifiable
     *
     * @see Personnage#getVies()
     * @see Personnage#setVies(int)
     */
    private int vies;

    /**
     * la force du personnage.Modifiable
     *
     * @see Personnage#getForce()
     * @see Personnage#setForce(int)
     */
    private int force;

    /**
     * Le type d'attaque du personnage
     */
    private Attaque attaque;

    //constructeur 1 sans paramètre >> constructeur par défaut
    public Personnage() {

    }

    //constructeur 2 avec 1 paramètre
    public Personnage(String name) {

    }

    //constructeur 3 avec plusieurs paramètres

    /**
     * Constructeur Personnage
     *
     * @param name    Le nom du personnage
     * @param image   L'image du personnage
     * @param vies    Le niveau de vies du personnage
     * @param force   La force du personnage
     * @param attaque le type d'attaque du personnage
     * @see Personnage#name
     * @see Personnage#image
     * @see Personnage#vies
     * @see Personnage#force
     * @see Personnage#attaque
     */

    public Personnage(String name, String image, int vies, int force, Attaque attaque) {
        this.name = name;
        this.image = image;
        this.vies = vies;
        this.force = force;
        this.attaque = attaque;
    }

    /**
     * Retourne le nom du personnage
     *
     * @return le nom du personnage sous forme d'une chaîne de caractères
     */
    public String getName() {
        return this.name;
    }


    /**
     * Met à jour le nom du personnage
     *
     * @param name Le nouveau nom du personnage
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Retourne le niveau de vies du personnage
     *
     * @return le niveau de vies du personnage sous la forme d'un entier
     */
    public int getVies() {
        return this.vies;
    }

    /**
     * Met à jour le niveau de vies du personnage
     *
     * @param vies le nouveau niveau de vies du personnage
     */
    public void setVies(int vies) throws PersonnageException {
        if (vies < this.getMinVies() || vies > this.getMaxVies()) {
            throw new PersonnageException("Le niveau de vies doit être compris entre [" + this.getMinVies() + "," + this.getMaxVies() + "]");
        }
        this.vies = vies;
    }


    /**
     * Retourne la force du personnage
     *
     * @return la force du personnage sous la forme d'un entier
     */
    public int getForce() {
        return this.force;
    }

    /**
     * Met à jour la force du personnage
     *
     * @param force la nouvelle force du personnage
     */
    public void setForce(int force) throws PersonnageException {
        if (force < this.getMinForce() || force > this.getMaxForce()) {
            throw new PersonnageException("La force doit être comprise entre [" + this.getMinForce() + "," + this.getMaxForce() + "]");
        }
        this.force = force;
    }

    public Attaque getAttaque() {
        return this.attaque;
    }

    public void setAttaque(Attaque attaque) {
        this.attaque = attaque;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * décrit les personnages créés
     *
     * @return une chaine de caractères servant à décrire les objets
     */
    public String toString() {
        return "Je suis un " + this.getClass().getSimpleName() + ", je m'appelle " + name + ". Je possède " + vies + " vies " + "et ma force d'attaque est : " + force;
    }

    public abstract int getMinVies();

    public abstract int getMaxVies();

    public abstract int getMinForce();

    public abstract int getMaxForce();
}


