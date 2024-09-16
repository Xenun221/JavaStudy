package academy.devdojo.maratona.java.introducao;

public class Aula02TIposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos que vão guardar em memoria um valor simples:
        int, float, char, byte, short, long, boolean, double
         */


        //Criando uma variavel: colocar um tipo depois o nome da váriavel(Aula 11 pt2)
        /*A maioria dos tipos vão guardar numeros a diferença dele e o tanto que ele pode armazenar
        https://www.dio.me/articles/java-tipos-primitivos
         */
        int  idadeDoPai = 18;
        long numeroGrande = 100000;
        double salario = 2000.0;
        // CASTING QUANDO A GENTE FORÇA O JAVA COLOCAR UM VALOR DE UMA VARIAVEL DENTRO DA OUTRA
        //Especificar um decimal usando FLOAT
        float salarioFLoat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean falso = false;
        char caractere = 'F'; // Vai armazenar um caractere apenas


        //Exibindo o valor(imprimir no console)
        System.out.println("A idade é: "+ idadeDoPai);
        System.out.println(false);
        System.out.println(caractere);

        //Aula13 TIpo primitivo String. String não e um tipo primitivo, string e uma classe
        String nome = "Xenun";
        System.out.println("Seu nome é " + nome);

    }
}
