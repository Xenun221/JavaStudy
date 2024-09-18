package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticoes01 {
    public static void main(String[] args) {
        //Nos temos 3 estruturas basicas de repetição
        //while, do while e for

        //While sintaxe while(RESULTAR EM VALOR BOOLEANO){}

        //Tenho contador e vou começar do 0
        int count = 0;
        while (count < 1000){
            System.out.println(count);
            count += 100;
            //Ele substitui o valor do count que esta 0 para 1 count += 1;
            // SEMPRE LEMBRAR DE TROCAR A CONDIÇÃO DA VARIAVEL EM ALGUM MOMENTO DENTRO DO CÓDIGO SE NÃO ELE VAI RODAR PARA SEMPRE
        }


        /*
        DO while e praticamente igual o while. Com a diferneça que ele vai executar pelo menos uma vez. Idepedente de ser
        True ou False
         */
        //Se quiser repetir
        count = 0;
        do {
            System.out.println("Dentro do-while" + count);
            count = count + 1;
        } while (count < 10); {
          //PELO MENOS UMA VEZ ELE SEJA EXECUTADO IDEPENDEN
        }

        //FOR
        /*

         */
        //Variavel local precisa ser inicializada
        for (int i=0;i<11;i+=1){
            System.out.println("FOR" + i);
        }

    }
}
