
import java.util.Scanner;

public class App {

    public static boolean Par(int a) {

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Olá, digite o número!");
        int a = leitor.nextInt();
        Boolean Verify = Par(a);
        System.out.printf("O número é par? %b", Verify);

        leitor.close();
    }
}
