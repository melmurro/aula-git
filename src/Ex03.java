import java.util.Scanner;
public class Ex03 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Nickname");
        String nickname = sc.next();

        IO.println("Jogo favorito");
        String jogo = sc.next();

        IO.println("Pontuação atual");
        Double pontuação = sc.nextDouble();

        IO.println("Nickname: " + nickname);

        IO.println("Jogo favorito: " + jogo);

        IO.println("Pontuação atual: " + pontuação);




    }





}
