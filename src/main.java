import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * main est la classe contenant le programme
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//création de l'objet scanner
        int retourMenu = 0;
        ArrayList<Personnage> listePersonnages = new ArrayList<Personnage>(); // création d'un objet arraylist

        int nbCreationPersonnage = 0; // index tableau listePersonnages
        int choix = 0;


        //creation du menu
        while (retourMenu == 0) {
            choix = chooseAction(sc, choix);
            nbCreationPersonnage = executeAction(sc, listePersonnages, nbCreationPersonnage, choix);
            System.out.println("souhaitez-vous sortir du programme (0: non, 1: oui)");
            retourMenu = sc.nextInt();
        }
    }


    private static int chooseAction(Scanner sc, int choix) {
        System.out.println(" ");
        System.out.println("Que voulez-vous faire? ");
        System.out.println("1 : créer un personnage");
        System.out.println("2 : lister tous les personnages existants");
        System.out.println("3 : choisir un personnage");
        //gestion d'exception
        try {
            choix = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("saisie invalide!");

        }
        sc.nextLine(); //vider le caractère spécial "entrée" saisi avec le sc nextInt
        return choix;
    }


    private static int executeAction(Scanner sc, ArrayList<Personnage> listePersonnages, int nbCreationPersonnage, int choix) {
        switch (choix) {
            case 1:
                return createPersonnage(sc, listePersonnages, nbCreationPersonnage);
            case 2:
                return displayPersonnages(listePersonnages);
            case 3:
                return choosePersonnage(sc, listePersonnages, nbCreationPersonnage);
        }
        return nbCreationPersonnage;
    }

    private static int choosePersonnage(Scanner sc, ArrayList<Personnage> listePersonnages, int nbCreationPersonnage) {
        System.out.println("Saisissez le numéro du personnage?");
        int choixPerso = SaisirUnEntier(sc);

        System.out.println("Que souhaitez vous faire? :");
        System.out.println("1 : afficher toutes ses informations");
        System.out.println("2 : supprimer ce personnage");
        System.out.println("3 : modifier ses informations");
        int choixAction = SaisirUnEntier(sc);

        switch (choixAction) {
            case 1://affichage Personnage
                System.out.println("Informations du personnage sélectionné : ");
                System.out.println(listePersonnages.get(choixPerso).toString());
                break;
            case 2://suppression personnage
                listePersonnages.remove(choixPerso);

                break;
            case 3://modification Personnage
                try {

                    System.out.println("que voulez-vous modifier?");
                    System.out.println("1 : nom");
                    System.out.println("2 : niveau de vies");
                    System.out.println("3 : niveau de force");
                    int choixActionBis = SaisirUnEntier(sc);
                    switch (choixActionBis) {
                        case 1:
                            System.out.println("changez le nom: ");
                            String nom = sc.next();
                            listePersonnages.get(choixPerso).setName(nom);
                            break;
                        case 2:
                            System.out.println("changez le niveau de vies: ");
                            int vies = SaisirUnEntier(sc);
                            listePersonnages.get(choixPerso).setVies(vies);
                            break;
                        case 3:
                            System.out.println("changez le niveau de force: ");
                            int force = SaisirUnEntier(sc);
                            listePersonnages.get(choixPerso).setForce(force);
                            break;
                    }
                } catch (PersonnageException e) {
                    System.err.println(e.getMessage());
                }
                break;
        }
        return nbCreationPersonnage;
    }

    private static int displayPersonnages(ArrayList<Personnage> listePersonnages) {
        int nbCreationPersonnage;
        System.out.println("afficher les personnages existants : ");
        for (nbCreationPersonnage = 0; nbCreationPersonnage < listePersonnages.size(); nbCreationPersonnage++) {
            if (listePersonnages.get(nbCreationPersonnage) != null) { //si la case du tableau n'est pas null
                System.out.print("numéro du personnage = " + nbCreationPersonnage + " | ");
                System.out.println(listePersonnages.get(nbCreationPersonnage).toString());
            }
        }
        return nbCreationPersonnage;
    }

    private static int createPersonnage(Scanner sc, ArrayList listePersonnages, int nbCreationPersonnage) {
        System.out.println("création du personnage " + (nbCreationPersonnage + 1));
        System.out.println("Saisissez un type de personnage (1: guerrier ou 2: magicien)");

        int type = 0;

        //gestion d'exception
        try {
            type = sc.nextInt(); // pour récupérer la saisie utilisateur
            sc.nextLine(); //vider le caractère spécial "entrée" saisi avec le sc nextInt

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

            System.out.println("Saisissez le nombre de vies pour un " + p.getClass().getSimpleName() + " (entre " + p.getMinVies() + " ou " + p.getMaxVies() + " ) : ");

            int vies = SaisirUnEntier(sc);
            try {
                p.setVies(vies);
            } catch (PersonnageException e) {
                System.err.println(e.getMessage());
            }
            sc.nextLine();

            System.out.println("Saisissez un nombre entre " + p.getMinForce() + " et " + p.getMaxForce() + " pour définir la force d'attaque: ");
            int force = SaisirUnEntier(sc);

            try {
                p.setForce(force);

            } catch (PersonnageException e) {
                System.err.println(e.getMessage());
            }
            sc.nextLine();

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
            System.out.println("Saisissez le niveau pour " + a.getClass().getSimpleName() + ": ");
            int niveauAtt = SaisirUnEntier(sc);

            a.setName(nomAtt);
            a.setNiveau(niveauAtt);
            p.setAttaque(a);

            System.out.println(p);
            listePersonnages.add(p);
            //listePersonnages[nbCreationPersonnage] = p;
            nbCreationPersonnage++;

        } catch (PersonnageException e2) {
            System.out.println("Invalide! saisir 1 pour Guerrier ou 2 pour Magicien");
        }

        return nbCreationPersonnage;
    }

    private static int SaisirUnEntier(Scanner sc) {
        int choix = sc.nextInt();
        sc.nextLine();
        return choix;
    }
}
