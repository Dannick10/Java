package academy.devdojo.maratona.introducao;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // (int) casting
        int age = (int) 10L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0;
        byte idadeByte = 10;
        short idadeSHort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);

    }
}
