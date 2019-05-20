import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//création de l'objet scanner
        int poursuiteCreationPersonnage = 0;


        int nbCreationPersonnage = 0;
        String ListePersonnages [];


        while (poursuiteCreationPersonnage == 0) {

            nbCreationPersonnage++;

            System.out.println("création du personnage " + nbCreationPersonnage);
            System.out.println("Saisissez un type de personnage (1: guerrier ou 2: magicien");
            int type = sc.nextInt(); // pour récupérer la saisie utilisateur

            System.out.println("Saisissez un nom de personnage: ");
            String name = sc.next();
            System.out.println("Saisissez le nom d'une image");
            String image = sc.next();

            if (type == 1) {

                System.out.println("Saisissez le nombre de vies (5 ou 10) : ");
                int viesGuerrier = sc.nextInt();
                System.out.println("Saisissez un nombre entre 5 et 10 pour définir la force d'attaque: ");
                int forceGuerrier = sc.nextInt();
                System.out.println("Saisissez le nom d'une arme: ");
                String nomArme = sc.next();
                System.out.println("Saisissez le niveau de l'arme : ");
                int niveau = sc.nextInt();

                Arme arme = new Arme(nomArme, niveau);
                Guerrier guerrier = new Guerrier(name, image, viesGuerrier, forceGuerrier, arme);
                System.out.println();  guerrier.toString();



            } else {

                System.out.println("Saisissez le nombre de vies (3 ou 6) : ");
                int viesMagicien = sc.nextInt();
                System.out.println("Saisissez un nombre entre 8 et 15 pour définir la force d'attaque: ");
                int forceMagicien = sc.nextInt();
                System.out.println("Saisissez le nom d'un sort: ");
                String nomSort = sc.next();
                System.out.println("Saisissez le niveau du sort : ");
                int niveauSort = sc.nextInt();

                Sort sort = new Sort(nomSort, niveauSort);
                Magicien magicien = new Magicien(name, image, viesMagicien, forceMagicien, sort);
                System.out.println(magicien.toString());

            }

            System.out.println("Souhaitez-vous créer un autre personnage? ( 0: oui ; 1: non)");
            poursuiteCreationPersonnage = sc.nextInt();
        }
    }
}
