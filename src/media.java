import java.util.Scanner;

public class  media
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        while (contador < 5)
        {
            int numeroNota = contador + 1;
            System.out.print("Digite sua " + getNumeroOrdinal(numeroNota) + " nota: ");
            int nota = scanner.nextInt();
            soma += nota;
            contador++;
        }

        double media = (double) soma / 5;
        System.out.println("A média das notas é: " + media);
        scanner.close();

        if (media > 7) {
            System.out.println("Parabéns");
        } else {
            System.out.println("Se esforce mais na próxima");
        }

    }

    public static String getNumeroOrdinal(int numero)
    {
        String[] sufixos = {"primeira", "segunda", "terceira", "quarta", "quinta"};
        return sufixos[numero - 1];
    }
}
