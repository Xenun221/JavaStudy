package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais04Exercicios {
    public static void main(String[] args) {
        /*
Até R$1.903,98	Não há	–
De R$1.6903,99 até R$2.826,65	7,5%	R$142,80
De R$2.826,66 até R$3.751,05	15%	R$354,80
De R$3.751,06 até R$4.664,68	22,5%	R$636,13
         */
        double salario = 15000.00;

        double resSalario01 = 7.5 /100;
        double resTaxa01;


        double resSalario02 = 15.0 /100;
        double resTaxa02;

        double resSalario03 =  22.5/100;
        double resTaxa03;

        double valorImposto;


        if (salario >= 1693.99 && salario <= 2826.65){
           resTaxa01 = salario - (salario * resSalario01);
            System.out.println("Seu salario com a taxa de 7,5% fica no valor de: " + resSalario01);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            resTaxa02 = salario - (salario * resSalario02);
            System.out.println("Seu salario com a taxa de 15% fica no valor de: " +resTaxa02);
        } else if (salario >= 3751.06) {
            resTaxa03 = salario -  (salario * resSalario03);
            System.out.println("Seu salario com a taxa de 22,5% fica no valor de: " + resTaxa03);
        } else {
            System.out.println("Esta isento de taxas");
        }

    }
}
