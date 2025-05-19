public class ConversorTemperatura {
    public static void main(String[] args) {
        // Variável com a temperatura em Celsius
        double celsius = 25.0;

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Exibe o valor convertido com casas decimais
        System.out.println("Temperatura em Fahrenheit (com casas decimais): " + fahrenheit);

        // Casting para inteiro (sem casas decimais)
        int fahrenheitInteiro = (int) fahrenheit;

        // Exibe o valor convertido sem casas decimais
        System.out.println("Temperatura em Fahrenheit (inteiro): " + fahrenheitInteiro);
    }
}
