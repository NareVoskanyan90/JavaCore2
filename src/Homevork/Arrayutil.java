package Homevork;

public class Arrayutil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 20, 10, 88, 11, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            max = array[0];
            if (array[i] > max) {
                max = array[i];
                System.out.println(max);
                for (int K = 0; K < array.length; K++) {

                    int min = array[0];
                    if (array[i] < min) {
                        min = array[i];
                        System.out.print(min +" ");

                    }

                }
            }
        }
    }}












