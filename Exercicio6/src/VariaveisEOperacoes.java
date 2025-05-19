public class VariaveisEOperacoes  {
    public static void main(String[] args) {

        // 1. Média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2. Casting de double para int
        double numeroDouble = 9.8;
        int numeroInt = (int) numeroDouble;  // Casting explícito
        System.out.println("Valor inteiro (casting de 9.8): " + numeroInt);

        // 3. Concatenação de char e String
        char letra = 'A';
        String palavra = "luno";
        String mensagem = letra + palavra;
        System.out.println("Mensagem concatenada: " + mensagem);

        // 4. Cálculo do valor total (preço x quantidade)
        double precoProduto = 19.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total da compra: R$ " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.println("Valor em reais: R$ " + valorEmReais);

        // 6. Cálculo de desconto sobre o preço original
        double precoOriginal = 100.0;
        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}
