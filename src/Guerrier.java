public class Guerrier extends Personnage {
    public String arme;
    public String bouclier;


    //constructeur 1 sans paramètre >> constructeur par défaut

    public Guerrier() {

    }

    //constructeur 2 avec 1 paramètre

    public Guerrier(String name) {

    }

    //constructeur 3 avec plusieurs paramètres

    public Guerrier(String name, String image, int vies, int force, String arme) {
        this.name = name;
        this.image = image;
        this.vies = vies;
        this.force = force;
        this.arme = arme;

    }
}
