
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia;
        System.out.print("Digite um dia.");
        dia = leitor.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Fim de semana(Domingo)");
                break;
            case 2:
                System.out.println("Dia da semana(Segunda)");
                break;
            case 3:
                System.out.println("Dia da semana(Terça)");
                break;
            case 4:
                System.out.println("Dia da semana(Quarta)");
                break;
            case 5:
                System.out.println("Dia da semana(Quinta)");
                break;
            case 6:
                System.out.println("Dia da semana(Sexta)");
                break;
            case 7:
                System.out.println("Fim de semana(Sábado)");
                break;
            default:
                System.out.println("Dia inválido");

        }
    }
}
