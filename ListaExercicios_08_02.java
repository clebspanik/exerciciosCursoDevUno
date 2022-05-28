
/* 
*/
import java.util.Scanner;

public class ListaExercicios_08_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] meses = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int mes;

        System.out.println("Digite o mês:");
        mes = ler.nextInt();

        if (mes == meses[0] || mes == meses[1] || mes == meses[2]) {
            System.out.println("PRIMEIRO TRIMESTRE");
        } else if (mes == meses[3] || mes == meses[4] || mes == meses[5]) {
            System.out.println("SEGUNDO TRIMESTRE");
        } else if (mes == meses[4] || mes == meses[5] || mes == meses[6]) {
            System.out.println("TERCEIRO TRIMESTRE");
        } else {
            System.out.println("QUARTO TRIMESTRE");
        }
        ler.close();

    }

}
