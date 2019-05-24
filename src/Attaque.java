/**
 * Attaque est la classe représentant un type d'attaque du Personnage
 * Une attaque est caractérisée par les propriétés suivantes:
 * un nom,
 * un niveau
 */
public abstract class Attaque {
    private String name;
    private int niveau;

    /**
     * Constructeur par défaut d'une attaque
     */
    public Attaque(){

    }
    /**
     * Constructeur d'une Attaque
     *
     * @param name
     *  Le nom de l'attaque
     * @param niveau
     *  le niveau de l'attaque
     */
    public Attaque(String name, int niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    public String getName() {
        return this.name;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    /**
     * décrit l'arme créée
     * @return une chaine de caractères servant à décrire l'arme
     */
    @Override
    public String toString() {
        return "J'ai un(e)"+ getClass().getSimpleName()+" dont le nom est :" + name + " et son niveau est : " + niveau;
    }
}
