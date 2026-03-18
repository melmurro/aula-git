import java.util.Scanner;
public class ex04 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("quantos passos voce deu hoje??");
        int passos = sc.nextInt();

        int meta = 10000;

        if (passos >= meta) {
            IO.println("Parabéns");
            IO.println(passos - meta);
        }
    else{
        IO.println("meta nao atingida");
        IO.println(meta - passos); }
    }
}
