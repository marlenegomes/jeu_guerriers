/**
 * Case est la classe représentant une case du plateau de jeu
 */
public class Case {
    private String evenement;


    /**
     * Constructeur d'une case
     * @param evenement : l'evenement de la case
     */
    public Case(String evenement) {
    this.evenement = evenement;
}


    public String getEvenement() {
        return this.evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }


}