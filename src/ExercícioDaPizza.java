import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercícioDaPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de pizza vendida: ");
        double qntdDePizza = scanner.nextDouble();

        int preco = 40;
        int funcionarios = 4;
        int salario = 1500;
        double fg = 0.03;

        int menorQueDoisMil = funcionarios * salario;
        int maiorQueDoisMil = (funcionarios * salario) + (int) (preco * qntdDePizza * fg);

        DecimalFormat format = new DecimalFormat("#,##0.00");

        if (qntdDePizza <= 2000) {
            System.out.println("A folha de pagamento é de R$" + format.format(menorQueDoisMil));
        } else {
            System.out.println("A folha de pagamento é de R$" + format.format(maiorQueDoisMil));
        }
    }
}



