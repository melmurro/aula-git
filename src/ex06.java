import java.util.Scanner;
public class ex06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Quantas horas voce estudou?");
        double horas = sc.nextDouble();

        int meta = 40;

        if (horas >= meta) {
            IO.println("parabens vc conseguiu!!");
            IO.println(horas - meta);
        }else{
            IO.println(meta - horas);
            IO.println("nao conseguiu, melhore");

        }
        }
    }
