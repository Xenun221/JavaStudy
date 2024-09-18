package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticoes03 {
    public static void main(String[] args) {
        /*
        Quero imprir os primeiro 25 numeros de um dado valor. Por exemplo o a 50
        BREAK VAI PARAR E SAIR DO LAÇO DE REPETIÇÃO
         */
        //Podemos criar uma variavel denominando o valor maximo
        int valorMax = 50;
        for (int i=0; i<=valorMax;i++){
            if (i > 25){
                break;
            }
            System.out.println("i= "+i);
        }
    }
}
