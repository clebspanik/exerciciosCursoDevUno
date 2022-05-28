
/* 
2) Solicite a nota da prova e o percentual de frequência de 10 alunos, ao final apresente uma mensagem indicando
quantos alunos tiraram nota 10 com uma frequência mínima de 80% no curso.
Exemplo:
Nota: 10
Frequência: 70
*/
import java.util.Scanner;

public class ListaExercicios_06_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int alunosAprovados = 0;
        double nota, frequencia;

        for (int i = 0; i <= 1; i++) {
            System.out.println("Digite sua nota:");
            nota = ler.nextDouble();

            System.out.println("Digite a frequencia:");
            frequencia = ler.nextDouble();

            if (nota == 10 && frequencia >= 80) {
                alunosAprovados++;
            }
        }
        System.out.printf("%d Passaram Com Nota 10", alunosAprovados);
        ler.close();
    }

}
