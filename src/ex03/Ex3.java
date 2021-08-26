package ex03;

/*Crie um programa para mostrar os números pares existentes em um intervalo. O
usuário deverá fornecer os valores iniciais (inicial > 0) e final (inicial < final) e os
números pares existentes no intervalo ([inicial,final]) devem se separados por um
espaço em branco.
Exemplo:
Entrada: 1 – 14
Saída: 2 4 6 8 10 12 14
OBS: Fazer validação de erro caso o usuário digite o valor final menor que o
valor inicial*/

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        boolean cond = true;

       do {

            System.out.println("Digite o numero inicial");
            int initValue = l.nextInt();
            System.out.println("Digite o valor final");
            int finalValue = l.nextInt();

            if (finalValue < initValue) {
                System.out.println("O valor final não pode ser menor que o inicial! tente novamente");
            } else {
                for (int i = initValue; i <= finalValue; i++) {
                    if (i % 2 == 0) System.out.print(i + " ");
                }
                cond = false;
            }
        } while (cond == true);
    }
}

