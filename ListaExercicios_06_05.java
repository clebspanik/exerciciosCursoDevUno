
/* 
5) Você vai fazer uma viagem de 7 dias para os Estados Unidos e levará apenas um cartão de crédito internacional.
Faça um programa que permita lançar o valor gasto em cada dia de viagem, esse valor deve ser informado em dólares
e já deve ser digitado o somatório de todos gastos do dia (incluindo alimentação, compras, transporte, hospedagem,
etc).
Ao final do programa informe a cotação atual do dólar e apresente o valor total gasto durante a viagem já convertido em
reais.
*/
import java.util.Scanner;

public class ListaExercicios_06_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorDiario, dolar, valorTotal = 0;
        int qtdDiasAula;

        System.out.println("Digite aCotacao Dolar:");
        dolar = ler.nextDouble();
        for (qtdDiasAula = 0; qtdDiasAula <= 1; qtdDiasAula++) {
            System.out.println("Digite o valor gasto no dia:");
            valorDiario = ler.nextDouble();
            valorTotal = valorTotal + valorDiario;

        }

        // Passado o valor em reais e convertido na saida
        System.out.printf("Gasto Total em dolar %.2f", (valorTotal * dolar));

        ler.close();
    }

}
