import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        @SuppresWarnings("UnusedAssigment")
        int quantidade = 1;
        int qnt_total = 0;
        float valor_unitario = 0;
        float valor_produto = 0;
        float valor_total = 0;
        boolean status = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 na quantidade para finalizar a compra");

        while (status == false) {
            System.out.println("Digite a quantidade desse item");
            quantidade = sc.nextInt();

            if (quantidade > 0) {
                System.out.println("Digite o preço unitário desse item");
                valor_unitario = sc.nextFloat();

                valor_produto = quantidade * valor_unitario;
                valor_total = valor_total + valor_produto;
                qnt_total = qnt_total + quantidade;

            } else {
                status = true;
            }

        }

        System.out.println("O número total de itens comprados foi: " + qnt_total);
        System.out.println("Totalizando: "+ valor_total );
    }

}