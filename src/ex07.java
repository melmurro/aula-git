import java.util.Scanner;
public class ex07 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Qual foi a sua nota??");
        double nota = sc.nextDouble();

        double meta = 7;

        if (nota >=7) {

            IO.println("arrasou, aprovado!!");

        } else {

            IO.println("reprovado");

        }

    }
}