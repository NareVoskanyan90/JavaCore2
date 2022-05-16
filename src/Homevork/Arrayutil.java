package Homevork;

public class Arrayutil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 20, 10, 88, 11, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int x = array[0];
        for (int i = 0; i < array.length; i++) {

            x = array[0];
            if (array[i] > x) {
                x = array[i];
                System.out.println(x);

            }
        }
    }
}










