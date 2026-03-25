import java.util.Scanner;
public class ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("qual a sua idade?");

        int idade = sc.nextInt();

        int maioridade = 18;

        if (idade >= 18) {
            IO.println("acesso liberado");

        }else{
            IO.println("acesso negado");
        }
    }
}
