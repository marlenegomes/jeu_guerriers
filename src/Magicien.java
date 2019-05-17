public class Magicien extends Personnage {
    public String sort;
    public String philtre;

    //constructeur 1 sans paramètre >> constructeur par défaut

    public Magicien() {

    }

    //constructeur 2 avec 1 paramètre

    public Magicien(String name) {

    }

    //constructeur 3 avec plusieurs paramètres

    public Magicien(String name, String image, int vies, int force, String sort) {
        this.name = name;
        this.image = image;
        this.vies = vies;
        this.force = force;
        this.sort = sort;
    }
}
