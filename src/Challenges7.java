import java.util.HashMap;
public class Challenges7 {

        public static void main(String[] args) {
            int[] tab = {2, 3, 2, 5, 3};
            HashMap<Integer, Integer> fréquence = new HashMap<>();

            for (int i = 0; i < tab.length; i++) {
                if (fréquence.containsKey(tab[i])) {
                    fréquence.put(tab[i], fréquence.get(tab[i]) + 1);
                } else {
                    fréquence.put(tab[i], 1);
                }
            }
            System.out.println(fréquence);
        }
}
