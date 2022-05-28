
/* 1) Solicite a nota da prova de 10 alunos, ao final apresente uma mensagem indicando quantos alunos devem fazer a
prova de recuperação.
* Alunos com nota 6 ou maior que 6 não precisam fazer a prova de recuperação. */
import java.util.Scanner;

public class ListaExercicios_06_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int alunosRecuperacao = 0;
        double nota;

        for (int i = 0; i <= 1; i++) {
            System.out.println("Digite sua nota:");
            nota = ler.nextDouble();

            if (nota <= 6) {
                alunosRecuperacao++;
            }
        }
        System.out.printf("%d Alunos precisam fazer a recuperação", alunosRecuperacao);
        ler.close();
    }

}
