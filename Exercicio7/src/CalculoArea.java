import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área do quadrado: " + (lado * lado));
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double area = Math.PI * raio * raio;
                System.out.println("Área do círculo: " + area);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
