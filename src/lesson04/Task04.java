package lesson04;

public class Task04 {
    public static void main (String[] args){
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        int i = 1;
        while (i <=10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j <= 10){
                int mult = i * j;
                if (mult <= 10)
                    System.out.print(mult + " ");
                else
                    System.out.print(mult + " ");
                j++;

            }
            System.out.println();
            i++;
        }

    }
}
