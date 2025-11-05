public class challenges8 {
    public static void main(String[] args) {
        int[] tab = {2, 6, 1, 4, 5};
        int cible = 6;
        for (int i = 0; i < tab.length; i++) {
            int somme = 0;
            for (int j = i; j < tab.length; j++) {
                somme += tab[j];


                if (somme == cible) {

                    for (int k = i; k <= j; k++) {
                        System.out.print(tab[k]);
                        if (k < j) System.out.print(", ");
                    }
                }
            }
        }
    }
}
