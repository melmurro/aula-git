import  java.util.Scanner;
        public class ex05 {
            static void main() {

                Scanner sc = new Scanner(System.in);

                IO.println("Quanto voce conseguiu guardar??");
                int guardado = sc.nextInt();

                int meta = 500;

                if (guardado >= meta) {
                    IO.println("parabens!!");
                    IO.println(guardado - meta);

                }else{
                    IO.println("meta nao atingida");
                    IO.println(meta - guardado);
            }
}

}
