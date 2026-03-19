
import java.util.Scanner;

public class ascii_var1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= 2 *i; j++) {

                System.out.print((char) (65 + j));

            }
            System.out.println();

        }

    }
}
