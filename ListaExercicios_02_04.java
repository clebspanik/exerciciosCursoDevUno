/*  4) Apresente a seguinte mensagem: 
Digite o dia da semana:  
1 - Domingo 
2 - Segunda-feira 
3 - Terça-feira 
4 - Quarta-feira 
5 - Quinta-feira 
6 - Sexta-feira 
7 - Sábado 
 */
import java.util.Scanner;

public class ListaExercicios_02_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Declaração Variáveis
        double dia;

        // Input Entradas
        System.out.println("Digite um dia entre 1-7:");
        dia = ler.nextDouble();


        // Validações 
        if(dia ==  1 || dia == 7){
            System.out.println("Fim de Semana");
        }
        else{
            System.out.println("Dia de Semana");
        }

    }
}
