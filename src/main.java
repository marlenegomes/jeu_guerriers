import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * main est la classe contenant le programme
 */
public class main {

    public static saisirUnEntier()
    function saisirUnEntier(p) {
        return un entier;
        boucle tant que entier pas conforme
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//création de l'objet scanner
        int retourMenu = 0;
        Personnage[] listePersonnages; // déclare que le tableau nommé listePersonnages est de type Personnage (objet)
        listePersonnages = new Personnage[15]; // construit un tableau pour 15 variables de type Personnage(objet)
        //boolean forceMenu2 = false;
        //boolean forceNbVies = false;
        //boolean forceNbForce = false;
        int nbCreationPersonnage = 0; // index tableau listePersonnages
        int choix = 0;

        //creation du menu
        while (retourMenu == 0) {

            //if (!forceMenu2) {
                System.out.println(" ");
                System.out.println("Que voulez-vous faire? ");
                System.out.println("1 : créer un personnage");
                System.out.println("2 : lister tous les personnages existants");
                System.out.println("3 : choisir un personnage");
                //gestion d'exception
                choix = saisirUnEntier();
                /*try {
                    choix = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("saisie invalide!");
                }
                sc.nextLine(); //vider le caractère spécial "entrée" saisi avec le sc nextInt*/
            //}

            switch (choix) {
                case 1:
                    System.out.println("création du personnage " + (nbCreationPersonnage + 1));
                    System.out.println("Saisissez un type de personnage (1: guerrier ou 2: magicien)");
                    int type = 0;
                    //gestion d'exception
                    try {
                        type = saisirUnEntier();
                        /*type = sc.nextInt(); // pour récupérer la saisie utilisateur
                        sc.nextLine(); //vider le caractère spécial "entrée" saisi avec le sc nextInt*/

                        Personnage p; // création d'un personnage

                        if (type == 1) {
                            p = new Guerrier();
                        } else if (type == 2) {
                            p = new Magicien();
                        } else {
                            throw new PersonnageException("unknown character");
                        }

                        System.out.println("Saisissez un nom de personnage: ");
                        String name = sc.next();
                        p.setName(name);
                        System.out.println("Saisissez le nom d'une image");
                        String image = sc.next();
                        p.setImage(name);

                        /*if (!forceNbVies) {
                            System.out.println("Saisissez le nombre de vies pour un " + p.getClass().getSimpleName() + " (entre " + p.getMinVies() + " ou " + p.getMaxVies() + " ) : ");

                            int vies = sc.nextInt();
                            sc.nextLine();
                            try {
                                p.setVies(vies);
                            } catch (PersonnageException e) {
                                System.err.println(e.getMessage());
                                forceNbVies = true;
                            }
                        }*/
                        int vies = saisirUnEntier();

                        /*if (!forceNbForce) {
                            System.out.println("Saisissez un nombre entre " + p.getMinForce() + " et " + p.getMaxForce() + " pour définir la force d'attaque: ");
                            int force = sc.nextInt();
                            sc.nextLine();
                            try {
                                p.setForce(force);
                            } catch (PersonnageException e) {
                                System.err.println(e.getMessage());
                                forceNbForce = true;
                            }
                        }*/

                        int force = saisirUnEntier();

                        Attaque a; // création d'une attaque
                        if (type == 1) {
                            a = new Arme();
                        } else if (type == 2) {
                            a = new Sort();
                        } else {
                            throw new PersonnageException("unknown character");
                        }

                        System.out.println("Saisissez le nom d'une " + a.getClass().getSimpleName() + ": ");
                        String nomAtt = sc.next();
                        System.out.println("Saisissez le niveau de l'" + a.getClass().getSimpleName() + ": ");
                        int niveauAtt = sc.nextInt();
                        sc.nextLine();

                        a.setName(nomAtt);
                        a.setNiveau(niveauAtt);
                        p.setAttaque(a);

                        System.out.println(p);
                        listePersonnages[nbCreationPersonnage] = p;
                        nbCreationPersonnage++;

                    }
                    catch (PersonnageException e2) {
                        System.out.println("Invalide! saisir 1 pour Guerrier ou 2 pour Magicien");
                        //forceMenu2 = true;
                    }
                    break;
                case 2:
                    System.out.println("afficher les personnages existants : ");
                    for (nbCreationPersonnage = 0; nbCreationPersonnage < listePersonnages.length; nbCreationPersonnage++) {
                        if (listePersonnages[nbCreationPersonnage] != null) { //si la case du tableau n'est pas null
                            System.out.print("numéro du personnage = " + nbCreationPersonnage + " | ");
                            System.out.println(listePersonnages[nbCreationPersonnage].toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saisissez le numéro du personnage?");
                    int choixPerso = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Que souhaitez vous faire? :");
                    System.out.println("1 : afficher toutes ses informations");
                    System.out.println("2 : supprimer ce personnage");
                    System.out.println("3 : modifier ses informations");
                    int choixAction = sc.nextInt();
                    sc.nextLine();

                    switch (choixAction) {
                        case 1:
                            System.out.println("Informations du personnage sélectionné : ");
                            System.out.println(listePersonnages[choixPerso].toString());
                            break;
                        case 2:

                            for (nbCreationPersonnage = 0; nbCreationPersonnage < listePersonnages.length; nbCreationPersonnage++) {
                                if (nbCreationPersonnage == choixPerso) {
                                    listePersonnages[nbCreationPersonnage] = null;
                                }
                            }
                            break;
                        case 3:

                            try {

                                for (nbCreationPersonnage = 0; nbCreationPersonnage < listePersonnages.length; nbCreationPersonnage++) {
                                    if (nbCreationPersonnage == choixPerso) {
                                        System.out.println("que voulez-vous modifier?");
                                        System.out.println("1 : nom");
                                        System.out.println("2 : niveau de vies");
                                        System.out.println("3 : niveau de force");
                                        int choixActionBis = sc.nextInt();
                                        sc.nextLine();
                                        switch (choixActionBis) {
                                            case 1:
                                                System.out.println("changez le nom: ");
                                                String nom = sc.next();
                                                listePersonnages[choixPerso].setName(nom);
                                                break;
                                            case 2:
                                                System.out.println("changez le niveau de vies: ");
                                                int vies = sc.nextInt();
                                                sc.nextLine();
                                                listePersonnages[choixPerso].setVies(vies);
                                                break;
                                            case 3:
                                                System.out.println("changez le niveau de force: ");
                                                int force = sc.nextInt();
                                                sc.nextLine();
                                                listePersonnages[choixPerso].setForce(force);
                                                break;
                                        }
                                    }
                                }
                                System.out.println("Modifications : ");

                            } catch (PersonnageException e) {
                                System.err.println(e.getMessage());
                            }
                            break;
                    }
                    break;

            }

        }
    }
}
