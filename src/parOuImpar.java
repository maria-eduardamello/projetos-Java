import java.util.Scanner ;

public class parOuImpar
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        boolean nome = true;

        while (nome)
        {
            System.out.println("Digite um número");
            double numero = scanner.nextDouble();

            if (numero %2 == 0)
            {
                System.out.println ("O número é par");
            }

            else if ( numero %2 != 0)
            {
                System.out.println ("O número é ímpar");
            }

            System.out.println("deseja continuar? (s/n)");
            String resposta = scanner.next();

            if (resposta.equals("n") )
            {
                nome = false;
            }

        }

    }
}
