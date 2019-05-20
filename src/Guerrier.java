public class Guerrier extends Personnage {
    private Arme arme;
    private String bouclier;


    //constructeur 3 avec plusieurs paramètres

    public Guerrier(String name, String image, int vies, int force, Arme arme) {
        super(name, image, vies, force);
        this.arme = arme;

    }

    //getter : retourne le nom et le niveau de l'arme
    public Arme getArme() {
        return this.arme;
    }

    //setter : définit le nom et le niveau de l'arme
    //void car ne retourne rien
    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public String getBouclier() {
        return this.bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }
}
