

public class Personnage {

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

    public String toString(){
        return "Je suis un " + this.getClass().getSimpleName() + ", je m'appelle " + name + ". Je possède " +vies + "et ma force d'attaque est : " + force;
    }
}


