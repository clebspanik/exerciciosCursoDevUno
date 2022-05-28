
/* 
4) Para frequentar as aulas desta disciplina presencialmente, você deve estar tendo um custo diário de deslocamento e
talvez também esteja gastando um valorAlimentacao com alimentação.
Faça um algoritmo que seja possível informar o valorAlimentacao gasto com transporte e alimentação em cada dia de aula. Para os
dias que você faltou informe o valorAlimentacao zero para estas despesas.
Ao final mostre:
- O valorAlimentacao total gasto com transporte
- O valorAlimentacao total gasto com alimentação
- O valorAlimentacao total gasto com transporte e alimentação juntos
*/
import java.util.Scanner;

public class ListaExercicios_06_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorAlimentacao, valorTransporte, valorTotalAlimentacao = 0, valorTotalTransporte = 0;
        int qtdDiasAula;

        for (qtdDiasAula = 0; qtdDiasAula <= 1; qtdDiasAula++) {
            System.out.println("Digite o Valor diario da alimentacao:");
            valorAlimentacao = ler.nextDouble();
            valorTotalAlimentacao = valorTotalAlimentacao + valorAlimentacao;

            System.out.println("Digite o Valor do Transporte:");
            valorTransporte = ler.nextDouble();
            valorTotalTransporte = valorTotalTransporte + valorTransporte;
        }
        System.out.printf("Valor Total Transporte R$ %.2f \n", valorTotalTransporte);
        System.out.printf("Valor Total Alimentacao R$ %.2f \n", valorTotalAlimentacao);
        System.out.printf("Valor Total de Gastos R$ %.2f \n", (valorTotalTransporte + valorTotalAlimentacao));
        ler.close();
    }

}
