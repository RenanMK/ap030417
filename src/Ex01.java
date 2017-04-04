
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x, calculo;
        System.out.print("N1: ");
        x = leitor.nextInt();
        calculo = x % 3;

        switch (calculo) {
            case 0:
                System.out.println("O número é divisível por 3.");
                break;
            default:
                System.out.println("O número não é divísivel por 3.");
        }

    }

}
