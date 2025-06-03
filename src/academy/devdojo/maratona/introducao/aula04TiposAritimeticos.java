package academy.devdojo.maratona.introducao;

public class aula04TiposAritimeticos {

    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        //  %
        int resto = 21% 6;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;

        System.out.println("maior que vinte "+isDezMaiorQueVinte);
        System.out.println("menor que vinte "+isDezMenorQueVinte);
        System.out.println("igual a dez "+isDezIgualDez);
        System.out.println("igual a vinte "+isDezIgualVinte);
        System.out.println("diferente de dez "+isDezDiferenteDez);

    }
}
