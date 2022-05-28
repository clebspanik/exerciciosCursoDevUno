/* 1) Solicite a idade de uma candidato e apresente a mensagem: 
- Você está apto para se candidatar ao Curso de Formação de Programadores.  */

import java.util.Scanner;

public class ListaExercicios_02_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Declaração Variáveis
        int idade;

        // Input Entradas
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        if (idade >= 16) {
            System.out.println("Você está apto a trabalhar na desossa");
        } else {
            System.out.println("Você não possui idade o suficiente para trabalhar na desossa");
        }
    }
}
