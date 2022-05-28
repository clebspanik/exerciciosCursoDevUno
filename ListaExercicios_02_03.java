/* 3) Digite a sua idade e a idade de um dos seus avós e apresente uma em mensagem se a idade dele for o triplo da sua idade.  */
import java.util.Scanner;

public class ListaExercicios_02_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Declaração Variáveis
        int idade,idadeAvos;
    
        // Input Entradas
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        
        System.out.println("Digite a idade de  um de seus avós:");
        idadeAvos = ler.nextInt();
    
        if(idade * 3 == idadeAvos) {
             System.out.println("Você é três vezes mais velho que seu avó(ô)");
        }
      
    }
}
