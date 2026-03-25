import java.util.Scanner;
public class ex09 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("informe o valor da compra");

        double compra = sc.nextDouble();

        double valor = 100;

        if (compra >= 100) {
            IO.println("frete gratis aplicado");

        }else{
            IO.println("Adicione mais produtos para garantir frete gratis");
        }
    }
}
