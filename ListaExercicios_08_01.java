
/* 
*/
import java.util.Scanner;

public class ListaExercicios_08_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade, idade2;

        System.out.println("Digite a Primeira idade");
        idade = ler.nextInt();

        System.out.println("Digite a Primeira idade");
        idade2 = ler.nextInt();

        System.out.printf("A Difença de idade é de %d", (idade - idade2));

        ler.close();
    }

}
