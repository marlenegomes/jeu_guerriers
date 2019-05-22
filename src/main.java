import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//création de l'objet scanner
        int retourMenu = 0;

        Personnage[] listePersonnages; // déclare que le tableau nommé listePersonnages est de type Personnage (objet)
        listePersonnages = new Personnage[15]; // construit un tableau pour 15 variables de type Personnage(objet)
        int i = 0;

        //creation du menu
        while (retourMenu == 0) {
            System.out.println("Que voulez-vous faire? ");
            System.out.println("1 : créer un personnage");
            System.out.println("2 : lister tous les personnages existants");
            System.out.println("3 : choisir un personnage");
            int choix = sc.nextInt();


            int poursuiteCreationPersonnage = 0;
            int nbCreationPersonnage = 1;


            switch (choix) {

                case 1:
                    System.out.println("créer un personnage");

                    while (poursuiteCreationPersonnage == 0) {


                        System.out.println("création du personnage " + nbCreationPersonnage);
                        System.out.println("Saisissez un type de personnage (1: guerrier ou 2: magicien)");


                        //gestion d'exception
                        int type = 0;
                        try {

                            type = sc.nextInt(); // pour récupérer la saisie utilisateur
                            sc.nextLine(); //vider

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
                                listePersonnages[i] = new Guerrier(name, image, viesGuerrier, forceGuerrier, arme);
                                nbCreationPersonnage++;
                                System.out.println(listePersonnages[i].toString());
                                i++;

                            } else{

                                System.out.println("Saisissez le nombre de vies (3 ou 6) : ");
                                int viesMagicien = sc.nextInt();
                                System.out.println("Saisissez un nombre entre 8 et 15 pour définir la force d'attaque: ");
                                int forceMagicien = sc.nextInt();
                                System.out.println("Saisissez le nom d'un sort: ");
                                String nomSort = sc.next();
                                System.out.println("Saisissez le niveau du sort : ");
                                int niveauSort = sc.nextInt();

                                Sort sort = new Sort(nomSort, niveauSort);
                                listePersonnages[i] = new Magicien(name, image, viesMagicien, forceMagicien, sort);
                                nbCreationPersonnage++;
                                System.out.println(listePersonnages[i].toString());
                                i++;
                            }

                            System.out.println("Souhaitez-vous créer un autre personnage? ( 0: oui ; 1: non)");
                            poursuiteCreationPersonnage = sc.nextInt();


                        } catch (InputMismatchException e) {
                            System.out.println("saisie invalide!");
                            sc.nextLine();
                        }
                    }

                    break;
                case 2:
                    System.out.println("afficher les personnages existants : ");
                    for (i = 0; i < listePersonnages.length; i++) {
                        if (listePersonnages[i] != null) { //si la case du tableau n'est pas null
                            System.out.print("numéro du personnage = " + i + " | ");
                            System.out.println(listePersonnages[i].toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saisissez le numéro du personnage?");
                    int choixPerso = sc.nextInt();

                    System.out.println("Que souhaitez vous faire? :");
                    System.out.println("1 : afficher toutes ses informations");
                    System.out.println("2 : supprimer ce personnage");
                    System.out.println("3 : modifier ses informations");
                    int choixAction = sc.nextInt();

                    switch (choixAction) {
                        case 1:
                            System.out.println("Informations du personnage sélectionné : ");
                            System.out.println(listePersonnages[choixPerso].toString());

                            break;
                        case 2:

                            for (i = 0; i < listePersonnages.length; i++) {
                                if (i == choixPerso) {

                                    listePersonnages[i] = null;
                                }
                            }

                            break;
                        case 3:

                            for (i = 0; i < listePersonnages.length; i++) {
                                if (i == choixPerso) {
                                    System.out.println("que voulez-vous modifier?");
                                    System.out.println("1 : nom");
                                    System.out.println("2 : niveau de vies");
                                    System.out.println("3 : niveau de force");
                                    int choixActionBis = sc.nextInt();
                                    switch (choixActionBis) {
                                        case 1:
                                            System.out.println("changez le nom: ");
                                            String nom = sc.next();
                                            listePersonnages[choixPerso].setName(nom);
                                            break;
                                        case 2:
                                            System.out.println("changez le niveau de vies: ");
                                            int vies = sc.nextInt();
                                            listePersonnages[choixPerso].setVies(vies);
                                            break;
                                        case 3:
                                            System.out.println("changez le niveau de force: ");
                                            int force = sc.nextInt();
                                            listePersonnages[choixPerso].setForce(force);
                                            break;
                                    }

                                }
                            }
                            System.out.println("Modifications : ");
                            break;
                    }
                    break;

            }

        }
    }
}
