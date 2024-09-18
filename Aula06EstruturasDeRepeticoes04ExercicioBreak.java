package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticoes04ExercicioBreak {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //Condição valor da parcela tem que ser >=1000 carro 40k posso parcelar em 40x de 1k

       double valorCarro = 30000;
        for (int i = 1; i <= valorCarro; i++){
            double valorParcela = valorCarro / i;
            if (valorParcela >= 3000){
                System.out.println("Um carro de " + valorCarro + " posso parcelar em " + i + "X sem juxo" + " que fica " + valorParcela);
            } else {
                 break;
            }

        }
    }
}
