package sortear;

import java.util.Random;
import java.util.Scanner;

public class SortearNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;

        System.out.println(numeroSecreto);

        while (tentativas > 0 && acertou == false) {
            System.out.println("Qual seu chute?");
            chute = sc.nextLong();

            if (numeroSecreto == chute) {
                System.out.println("Você acertou!");
                acertou = true;
            } else if (chute < numeroSecreto) {
                --tentativas;
                System.out.println("Numero muito pequeno!" + tentativas + " tentativas restantes.");

            } else {
                --tentativas;
                System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");
            }


        }


    }
}
