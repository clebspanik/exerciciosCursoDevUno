/* 2) Solicite o salário de uma pessoa e apresente uma mensagem indicando se pessoa ganha mais de dois salários mínimos.  */

import java.util.Scanner;

public class ListaExercicios_02_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        // Declaração Variáveis
        double salario;
        final double salarioMinimo = 1212; 
    
        // Input Entradas
        System.out.println("Digite seu salario:");
        salario = ler.nextDouble();

        // Validações 
        if(salario > (salarioMinimo * 2)){
            System.out.println("Você ganha mais de 2 sálarios minimos:");
        }
    }
}
