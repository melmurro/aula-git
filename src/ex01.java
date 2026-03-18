import java.util.Scanner;
public class ex01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("nome do aluno");
        String nome = sc.next();

        IO.println("curso matriculado");
        String curso = sc.next();

        IO.println("idade");
        int idade = sc.nextInt();

        IO.println("nome do aluno: " + nome);
        IO.println("curso matriculado: " + curso);
        IO.println("idade: " + idade);

    }






}
