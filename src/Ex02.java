
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia;
        System.out.println("Digite um dia da semana.");
        dia = leitor.nextInt();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
