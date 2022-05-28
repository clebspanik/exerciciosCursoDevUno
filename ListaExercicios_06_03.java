
/* 
3) A turma de algoritmos resolveu fazer uma confraternização de última hora, então não sabem qual será o cardápio.
Dependerá de quanto cada um conseguirá contribuir para realizar o evento.
Faça um programa que solicite o valor que cada poderá contribuir e ao final apresente o valor total arrecadado.
*/
import java.util.Scanner;

public class ListaExercicios_06_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor, valorTotal = 0;
        System.out.println("Quantos alunos serão:");
        int i = ler.nextInt();

        for (i = 0; i <= 1; i++) {
            System.out.println("Digite o valor da contribuição:");
            valor = ler.nextDouble();
            valorTotal = valorTotal + valor;

        }
        System.out.printf("Foi arrecadado R$ %.2f ", valorTotal);
        ler.close();
    }

}
