
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ano, mes, bissexto, bissexto2;
        System.out.println("Digite um ano.");
        ano = leitor.nextInt();
        System.out.println("Digite um mês.");
        mes = leitor.nextInt();
        bissexto = ano % 4;
        bissexto2 = ano % 400;
        switch (bissexto) {
            case 0:
                System.out.println("Ano bissexto.");
                break;
            default:
                System.out.println("Ano normal");
        }
        switch (bissexto2) {
            case 0:
                System.out.println("Ano bissexto.");
                break;
        }
        
    }

}
