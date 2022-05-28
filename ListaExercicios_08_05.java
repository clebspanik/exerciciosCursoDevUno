
/*
5) Ao pagar uma conta em atraso é cobrado uma multa de R$ 1,00 por cada dia de atraso. Porém se passar de 30 dias
o atraso, além de pagar o valor diário de multa é cobrado também uma taxa extra de R$ 10,00. Faça um algoritmo onde
seja informado o valor da conta e o número de dias em atraso, ao final você deve apresentar o valor a pagar incluindo o
valor de multa.
*/
import java.util.Scanner;

public class ListaExercicios_08_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double atraso = 1.00, taxa = 10.00, valorConta, valorTotal;
        int diasAtraso;

        System.out.println("Digite o valor da conta:");
        valorConta = ler.nextDouble();

        System.out.println("Digite a quantidade de dias de atraso:");
        diasAtraso = ler.nextInt();

        if (diasAtraso > 30) {
            valorTotal = valorConta + taxa + (diasAtraso * atraso);
        } else {
            valorTotal = valorConta + (atraso * diasAtraso);
        }

        System.out.printf("Total da divida %.2f", valorTotal);

    }
}
