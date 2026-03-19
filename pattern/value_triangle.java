package pattern;

import java.util.Scanner;

public class value_triangle {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.println();

        }

    }
}
