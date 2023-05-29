import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números pares entre " + numero1 + " e " + numero2 + ":");


        int numeroInicial, numeroFinal;
        if (numero1 < numero2)
        {
            numeroInicial = numero1;
            numeroFinal = numero2;
        }

        else
        {
            numeroInicial = numero2;
            numeroFinal = numero1;
        }


        for (int i = numeroInicial; i <= numeroFinal; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}


