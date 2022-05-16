package Homevork;

public class Arrayutil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 20, 10, 88, 11, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println("max=" + max);

                for (int j = 1; j < array.length; j++) {
                    int min = 0;
                    if (array[i] < min) {
                        min = array[i];
                        System.out.println("min=" + min);

                        for (int յ = 0; յ < array.length; յ++){
                            if (array[i] % 2 == 0) {
                                System.out.println(array[i]);
                            }
                        }
                      }
                }}}}}

