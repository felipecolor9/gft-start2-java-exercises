package ex01;

/* Crie uma aplicação que apresente um menu de opções para o cálculo das seguintes
operações entre dois números: adição, subtração, multiplicação e divisão. O programa
deve usar laços de repetição para possibilitar ao usuário a escolha da operação
desejada, a exibição do resultado e a volta ao menu de opções. Colocar validação
caso o usuário digite um número negativo ou uma Letra. O programa só termina
quando for escolhida a opção de saída.*/

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String optMenu, numb1, numb2;
        System.out.println("CALCULADORA BÁSICA");
        do {
            System.out.println("\nDigite o número correspondente a operação desejada e aperte enter: \n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n(Digite '5' e aperte enter para sair)");
            optMenu = l.next();

            if (Integer.parseInt(optMenu) == 1) {
                System.out.println("Digite o primeiro número");
                numb1 = l.next();
                System.out.println("Digite o segundo número para somar");
                numb2 = l.next();

                if ((numb1.matches("^[0-9]*$") && Integer.parseInt(numb1) > 0) && ((numb2.matches("^[0-9]*$")) && Integer.parseInt(numb2) > 0)) {
                    System.out.println("Resultado: " + sum(Integer.parseInt(numb1), Integer.parseInt(numb2)) + "\nRetornando ao menu principal...");
                } else {
                    System.out.println("Apenas números inteiros positivos maiores que 0 são permitidos, por favor, tentar novamente \nRetornando ao menu principal...");
                }
            }

            if (Integer.parseInt(optMenu) == 2) {
                System.out.println("Digite o primeiro número");
                numb1 = l.next();
                System.out.println("Digite o segundo número para subtração");
                numb2 = l.next();

                if ((numb1.matches("^[0-9]*$") && Integer.parseInt(numb1) > 0) && ((numb2.matches("^[0-9]*$")) && Integer.parseInt(numb2) > 0)) {
                    System.out.println("Resultado: " + subtract(Integer.parseInt(numb1), Integer.parseInt(numb2)) + "\nRetornando ao menu principal...");
                } else {
                    System.out.println("Apenas números inteiros positivos maiores que 0 são permitidos, por favor, tentar novamente \nRetornando ao menu principal...");
                }

            }

            if (Integer.parseInt(optMenu) == 3) {
                System.out.println("Digite o primeiro número");
                numb1 =l.next();
                System.out.println("Digite o segundo número para multiplicar");
                numb2 = l.next();

                if ((numb1.matches("^[0-9]*$") && Integer.parseInt(numb1) > 0) && ((numb2.matches("^[0-9]*$")) && Integer.parseInt(numb2) > 0)) {
                    System.out.println("Resultado: " + multiply(Integer.parseInt(numb1), Integer.parseInt(numb2)) + "\nRetornando ao menu principal...");
                } else {
                    System.out.println("Apenas números inteiros positivos maiores que 0 são permitidos, por favor, tentar novamente \nRetornando ao menu principal...");
                }

            }

            if (Integer.parseInt(optMenu) == 4) {
                System.out.println("Digite o primeiro número");
                numb1 = l.next();
                System.out.println("Digite o segundo número para dividir" );
                numb2 = l.next();

                if ((numb1.matches("^[0-9]*$") && Integer.parseInt(numb1) > 0) && ((numb2.matches("^[0-9]*$")) && Integer.parseInt(numb2) > 0)) {
                    System.out.println("Resultado: " + divide(Integer.parseInt(numb1), Integer.parseInt(numb2)) + "\nRetornando ao menu principal...");
                } else {
                    System.out.println("Apenas números inteiros positivos maiores que 0 são permitidos, por favor, tentar novamente \nRetornando ao menu principal...");
                }
            }

        } while (Integer.parseInt(optMenu) != 5);
    }

    private static Integer sum(int num1, int num2) {
        return num1+num2;
    }

    private static Integer subtract(int num1, int num2) {
        return num1-num2;
    }

    private static Integer multiply(int num1, int num2) {
        return num1*num2;
    }

    private static Integer divide(int num1, int num2) {
        return num1/num2;
    }
}
