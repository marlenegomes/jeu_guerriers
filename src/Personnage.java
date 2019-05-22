/**
 * Personnage est la classe représentant un personnage du jeu
 * Un personnage est caractérisé par les propriétés suivantes:
 * un nom, qui peut être modifié par l'utilisateur
 * une image
 * un niveau de vies, qui peut être modifié par l'utilisateur
 * un niveau de force, qui peut être modifié par l'utilisateur
 *
 *
 *
 *
 *
 * @author marlenegomes
 *
 *
 */
public abstract class Personnage {
    /**
     * le nom du personnage est modifiable
     */

    private String name;
    private String image;
    private int vies;
    private int force;

    //constructeur 1 sans paramètre >> constructeur par défaut

    public Personnage() {

    }

    //constructeur 2 avec 1 paramètre

    public Personnage(String name) {

    }

    //constructeur 3 avec plusieurs paramètres

    public Personnage(String name, String image, int vies, int force) {
        this.name = name;
        this.image = image;
        this.vies = vies;
        this.force = force;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVies() {
        return this.vies;
    }

    public void setVies(int vies) {
        this.vies = vies;
    }

    public int getForce() {
        return this.force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String toString(){
        return "Je suis un " + this.getClass().getSimpleName() + ", je m'appelle " + name + ". Je possède " + vies + " vies " + "et ma force d'attaque est : " + force ;
    }
}


