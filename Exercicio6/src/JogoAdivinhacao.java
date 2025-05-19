import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Gera número entre 0 e 100 (inclusive)
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int maxTentativas = 5;
        boolean acertou = false;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + maxTentativas + " tentativas.\n");

        while (tentativas < maxTentativas) {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                acertou = true;
                break; // Sai do loop se acertar
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é MAIOR que " + palpite + ".");
            } else {
                System.out.println("O número é MENOR que " + palpite + ".");
            }
        }

        if (!acertou) {
            System.out.println("\nSuas tentativas acabaram. O número era: " + numeroSecreto);
        }

        scanner.close();
    }
}
