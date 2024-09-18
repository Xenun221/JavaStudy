package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticoes05Continue {
    public static void main(String[] args) {
        double valorCarro = 3000;
        for (int i = (int) valorCarro; i >= 1; i--){
                double valorParcela = valorCarro / i;
                if (valorParcela < 100){
                    continue;
                }
            System.out.println("Parcela " + i + " R$ " + valorParcela);
        }
    }
}
