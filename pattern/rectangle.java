package pattern;


import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        int n = myobj.nextInt(); // rows
        int p = myobj.nextInt(); // columns

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }

        myobj.close();
    }
}