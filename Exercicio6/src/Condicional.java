public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamneto que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Deve pagar a locação");
        }
    }
}
