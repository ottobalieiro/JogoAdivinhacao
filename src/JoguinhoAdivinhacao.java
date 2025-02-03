import java.util.Random;
import java.util.Scanner;

public class JoguinhoAdivinhacao {
    public static void main(String[] args) {
            System.out.printf("%nAdivinhe o Número! Está entre 0 e 100. Você tera 5 Chances. %n%n");

        Scanner read = new Scanner(System.in);
        int number = new Random().nextInt(100);

        //System.out.println(number);

        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.printf("%dª Tentativa: ", attempt);
            int attemptNumber = read.nextInt();

            if (attemptNumber == number) {
                System.out.println("Muito bom! Na mosca.");
                break;
            } else if (attempt == 5) {
                System.out.printf("Ops!! Acabaram as chances... O número era %d.%n", number);

            }else if (attemptNumber > number) {
                System.out.printf("o Número que você procura é Menor %n%n");
            }  else {
                System.out.printf("o Número que você procura é Maior %n%n");
            }
        }
    }
}

