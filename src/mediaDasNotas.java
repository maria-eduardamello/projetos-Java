import java.util.Scanner;
public class mediaDasNotas
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número");
        double numero3 = scanner.nextDouble();

        double soma = (numero1 + numero2 + numero3) / 3;

        System.out.println ("A média é: " + soma);
    }
}


