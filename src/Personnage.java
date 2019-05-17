import java.util.Scanner;

public class Personnage {

    public int type;
    public String name;
    public String image;
    public int vies;
    public int force;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//création de l'objet scanner
        System.out.println("Saisissez un type de personnage (1: magicien ou 2: guerrier) : ");
        int type = sc.nextInt(); // pour récupérer la saisie utilisateur



        if (type == 1) {
            System.out.println("Saisissez un nom de personnage: ");
            String nameGuerrier = sc.next();
            System.out.println("Saisissez le nom d'une image");
            String imageGuerrier = sc.nextLine();
            System.out.println("Saisissez le nombre de vies (5 ou 10) : ");
            int viesGuerrier = sc.nextInt();
            System.out.println("Saisissez un nombre entre 5 et 10 pour définir la force d'attaque: ");
            int forceGuerrier = sc.nextInt();
            System.out.println("Saisissez le nom d'une arme: ");
            String nomArme = sc.nextLine();
            System.out.println("Saisissez le niveau de l'arme : ");
            int niveau = sc.nextInt();

            Arme arme = new Arme(nomArme, niveau);
            Guerrier guerrier = new Guerrier(nameGuerrier, imageGuerrier, viesGuerrier, forceGuerrier, nomArme);

        }
else{
            System.out.println("Saisissez un nom de personnage: ");
            String nameMagicien = sc.next();
            System.out.println("Saisissez le nom d'une image");
            String imageMagicien = sc.nextLine();
            System.out.println("Saisissez le nombre de vies (3 ou 6) : ");
            int viesMagicien = sc.nextInt();
            System.out.println("Saisissez un noombre entre 8 et 15 pour définir la force d'attaque: ");
            int forceMagicien = sc.nextInt();
            System.out.println("Saisissez le nom d'un sort: ");
            String nomSort = sc.nextLine();
            System.out.println("Saisissez le niveau du sort : ");
            int niveauSort = sc.nextInt();

            Sort sort = new Sort(nomSort, niveauSort);
            Magicien magicien = new Magicien(nameMagicien, imageMagicien, viesMagicien, forceMagicien, nomSort);
        }

    }
}

