
/* 
6) Uma empresa de transportes trocou o jogo de pneus dos 10 caminhões de sua frota.
Faça um algoritmo que seja possível informar a quilometragem que cada caminhão conseguiu fazer até o momento da
próxima troca de pneus.
O programa deve apresentar qual foi a maior quilometragem rodada entre os caminhões da frota.
reais.
*/
import java.util.Scanner;

public class ListaExercicios_06_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double quilometragem = 0;
        int qtdDiasAula;

        for (qtdDiasAula = 0; qtdDiasAula <= 1; qtdDiasAula++) {
            double km;
            System.out.println("Digite a Quilometragem:");
            km = ler.nextDouble();
            System.out.println("Digite o valor gasto no dia:");
            if (qtdDiasAula == 0) {
                quilometragem = km;
            } else if (quilometragem < km) {
                quilometragem = km;
            }

        }

        ler.close();
    }

}
