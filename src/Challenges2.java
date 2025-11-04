import java.util.Scanner;
public class Challenges2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

       // System.out.println("Compte à rebours :");
        for (int i = nombre; i >= 0; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
