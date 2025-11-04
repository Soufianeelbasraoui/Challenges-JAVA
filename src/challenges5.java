public class challenges5 {
    public  static void main(String[] args){

                int[] nombres = {4, 9, 1, 7, 3};

                int max = 0;
                int deuxiemeMax = 0;

                for (int i=0 ;i<nombres.length;i++) {
                    if (nombres[i] > max) {
                        max = nombres[i];
                    } else if (nombres[i] > deuxiemeMax && nombres[i] < max) {
                        deuxiemeMax = nombres[i];
                    }
                }

                System.out.println("Le maximum est : " + max);
                System.out.println("Le deuxième maximum est : " + deuxiemeMax);
            }
        }




