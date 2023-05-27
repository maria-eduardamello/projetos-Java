import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();

        scanner.nextLine(); // Consumir a nova linha pendente

        String operacaoString;
        System.out.print("Qual operação deseja realizar? (+ - * /)");
        operacaoString = scanner.nextLine();
        char operacao = operacaoString.charAt(0);

        System.out.print("Digite outro número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(0);
        }

        System.out.println("O resultado é: " + resultado);
    }
}
