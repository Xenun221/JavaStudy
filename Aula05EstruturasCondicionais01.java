package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //IF PT01

        /*
        Sintaxe:
        if(So pode ser executado se for booleano){
            BLOCO(PODEMOS COLOCAR UMA MENSAGEM)
            }
         */


        int idade = 15;
        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        //Podemos fazer desse jeito tabem
        boolean isAutorizadoComprarBebidaAlcolica = idade >=18;

        //Usando operador de negação
        if(!isAutorizadoComprarBebidaAlcolica){
            System.out.println("Não esta autorizado a comprar bebida alcolica");
        }


        //Não vai executar pois não estou associando c == false
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }


        //PT02 ELSE IF
        //Usamos o else caso nos temos mais de uma condição como nesse exemplo:
        float dinheiroCompraCarro = 30.000F;
        if (dinheiroCompraCarro >= 30.000){
            System.out.println("Pode comprar um carro");
        } else {
            System.out.println("Não tem dinheiro para comprar um carro");
        }
















    }
}
