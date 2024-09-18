package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais05Switch {
    public static void main(String[] args) {
        //Imprima o dia da semana considerand9o 1 como Domingo
        byte dia = 5;
        //Switch, podemos colocar variavel do tipo cha, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break; //Necessario colocar o break para ele parar se não vai executar
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                //Utilizamos o defaul caso nenhuma opção seja executada
                System.out.println("Opção invalida");
        }

        //Para saber se e homem ou mulher
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Sexo invalido");
        }

    }
}
