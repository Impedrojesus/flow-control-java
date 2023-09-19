import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                System.out.println("O primeiro número deve ser menor ou igual ao segundo número.");
            } else {
                int contador = 0;
                System.out.println("Números no intervalo:");
                for (int i = numero1; i <= numero2; i++) {
                    System.out.println(i);
                    contador++;
                }
                System.out.println("Total de números no intervalo: " + contador);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira números inteiros válidos.");
        } finally {
            scanner.close();
        }
    }
}

