
/* 
*/
import java.util.Scanner;

public class ListaExercicios_08_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade = 0, qtd = 0;

        while (idade != 80) {
            System.out.println("Digite a idade:");
            idade = ler.nextInt();
            qtd++;
        }
        System.out.printf("Digitadas %d", qtd);
        ler.close();
    }

}
