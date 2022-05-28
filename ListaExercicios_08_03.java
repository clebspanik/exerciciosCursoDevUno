
/* 
*/
import java.util.Scanner;

public class ListaExercicios_08_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int voto, votosBolsonaro = 0, votosLula = 0, votosNulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o seu voto \n 1-BOLSONARO \n 2-LULA \n 3-NÃO SABE");
            voto = ler.nextInt();
            if (voto == 1) {
                votosBolsonaro++;
            } else if (voto == 2) {
                votosLula++;
            } else {
                votosNulos++;
            }
        }
        System.out.printf("Votos Bolsonaro %d \n", votosBolsonaro);
        System.out.printf("Votos Lula %d \n", votosLula);
        System.out.printf("Votos Não Sabem %d \n ", votosNulos);
        ler.close();

    }

}
