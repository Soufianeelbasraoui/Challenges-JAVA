import java.util.Scanner;
import  java.util.Random;
public class Challenges3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random random = new Random();
        int n1 = random.nextInt(10) + 1;
        int n;
        System.out.println("Devinez le nombre entre 0 et 10 :");
        do {
            System.out.print("Entrez un nombre : ");
            n = clavier.nextInt();

            if (n == n1) {
                System.out.println("Bravo ! Vous avez trouvé !");
            } else if (n < n1) {
                System.out.println("Trop petit ! Essayez encore.");
            } else {
                System.out.println("Trop grand ! Essayez encore.");
            }
        } while (n != n1);

        clavier.close();
    }
}
