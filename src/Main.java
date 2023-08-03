import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    private static void task1() {
        System.out.println("Задача 1");
        int [] massive1 = new int[3];
        massive1 [0] = 1;
        massive1 [1] = 2;
        massive1 [2] = 3;
        System.out.println(Arrays.toString(massive1));
            double [] massive2 = {1.57, 7.654, 9.986};
            System.out.println(Arrays.toString(massive2));
                int [] massive3 = {1, 5, 3, 7, 9, 863, 576, 173};
                System.out.println(Arrays.toString(massive3));
    System.out.println();
    }
    private static void task2() {
        System.out.println("Задача 2");
        int [] masive1 = new int [3];
        masive1 [0] = 1;
        masive1 [1] = 2;
        masive1 [2] = 3;
        for (int index = 0; index < masive1.length; index++){
            if (index == masive1.length - 1){
                System.out.println(masive1[index]);
                break;
            }
            System.out.print(masive1[index] + ",");
        }
        double [] masive2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(masive2));

        boolean [] masive3 = {true, false, true};
        for (int index = 0; (index < masive3.length - 1); index++){
            System.out.println(masive3[index]);
        }
    }
    private static void task3() {
        System.out.println("Задача 3");
    }
    private static void task4() {
        System.out.println("Задача 4");
    }
}