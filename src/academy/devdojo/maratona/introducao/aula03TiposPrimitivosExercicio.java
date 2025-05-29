package academy.devdojo.maratona.introducao;

/*
Pratica

Crie variáveis para os campos descritos abaixo entre <> e imprime a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirma que recebi o salário de <salario>, na data <data>
 */

import java.util.Date;
import java.util.Scanner;

public class aula03TiposPrimitivosExercicio {


    public static void main(String[] args) {
        String nome = "";
        String endereco = "";
        double salario = 0;
        Date data = new Date();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = input.nextLine();

        System.out.println("Digite seu endereço");
        endereco = input.nextLine();

        System.out.println("Digite o salario recebido");
        salario = input.nextDouble();

        System.out.printf("Eu %s, morando no endereço %s,nome,endereco, confirmo que recebi o salário de %.2f, na data %tc",nome,endereco,salario,data);
    }

}
