import java.util.Scanner;

    public class Challenges6 {
        public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);
            int[] arr = {1, 2, 3, 4, 5};

            System.out.print("\n1. Faire une rotation à droite");
            System.out.print("\n2. Faire une rotation à gauche");
            System.out.print("\n===> Entrez un choix: ");
            int choix = clavier.nextInt();

            if (choix == 1) {
                int last = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;

            }
            else if (choix == 2) {
                int first = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = first;

            }
            else {
                System.out.println("Choix invalide !");
            }

            System.out.print("Résultat : ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }

