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

        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTOtalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean  isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTOtalContaPoupanca > valorPlaystation;

        System.out.println("Plastation é compravel: " + isPlayStationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);
    }
}
