public class Arme {
    private String name;
    private int niveau;

    public Arme(String name, int niveau){
        this.name = name;
        this.niveau = niveau;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return " .J'ai un(e) " + name + " et son niveau est : " + niveau;
    }
}
