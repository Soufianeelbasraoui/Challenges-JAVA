import java.util.Scanner;

public class Challenges4 {

        public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);
            double solde = 0; // solde initial
            int choix;

            do {
                System.out.println("\n=== Distributeur Automatique ===");
                System.out.println("1. Consulter le solde");
                System.out.println("2. Dépôt");
                System.out.println("3. Retrait");
                System.out.println("4. Quitter");
                System.out.print("Entrez votre choix : ");
                choix = clavier.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Votre solde est : " + solde + " €");
                        break;
                    case 2:
                        System.out.print("Entrez le montant à déposer : ");
                        double depot = clavier.nextDouble();
                        if (depot > 0) {
                            solde += depot;
                            System.out.println("Dépôt effectué avec succès.");
                        } else {
                            System.out.println("Montant invalide.");
                        }
                        break;
                    case 3:
                        System.out.print("Entrez le montant à retirer : ");
                        double retrait = clavier.nextDouble();
                        if (retrait > 0 && retrait <= solde) {
                            solde -= retrait;
                            System.out.println("Retrait effectué avec succès.");
                        } else if (retrait > solde) {
                            System.out.println("Solde insuffisant !");
                        } else {
                            System.out.println("Montant invalide.");
                        }
                        break;
                    case 4:
                        System.out.println("Merci d'avoir utilisé le distributeur. À bientôt !");
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }

            } while (choix != 4);

            clavier.close();
        }
    }


