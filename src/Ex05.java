
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String mes;
        System.out.println("Digite um mês.");
        mes = leitor.nextLine();

        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "fevereiro":
            case "junho":
            case "julho":
                System.out.println("Alta temporada.");
                break;
            case "marco":
            case "abril":
            case "maio":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("Baixa temporada.");
                break;
            default:
                System.out.println("Mês inválido.");
        }
    }
}
