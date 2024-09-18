package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Se eu vou fazer uma doação de 500 so posso fazer se meu salario for acima de 5k

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para caridade";
        String mensagemNaoDoar = "Não tenho condições de doar";


        //Criando if e else para guardar um valor dentro de uma variavel. Nesses casos podemos utilizar o operador ternario
        /*
        if(salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */

        /* Operador ternario e utilizado para simplificar o if e else. Ele precisa pegar o resultado e colocar em algum lugar
            Sintaxe: String resultado = (condicao) ? verdadeiro : falso;
        */
        String resultado = salario >  500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
