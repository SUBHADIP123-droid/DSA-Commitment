
import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print((char) (65 + i));

            }
            System.out.println();

        }

    }
}
