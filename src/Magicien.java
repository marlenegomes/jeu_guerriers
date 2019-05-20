public class Magicien extends Personnage {
    private Sort sort;
    private String philtre;

    public Magicien(String name, String image, int vies, int force, Sort sort) {
        //super : pour faire appel aux attributs de la classe mère personnage
        //récupère les éléments de l'objet de base et envoie à l'objet hérité
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
}
