package ex02;

/* Vou lançar a LotoCle. Preciso de uma aplicação onde é sorteado 4 números de
unidade e dezenas aleatório entre 0 a 20. O usuário faz sua aposta digitando seus 4
números da sorte....Só ganha o prêmio se acertar os 4.
OBS: Os 4 números aleatórios não pode conter números repetidos.*/

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int correctNumbs;

        System.out.println("Digite os seus 4 números da sorte, para cada número escolhido, pressione enter:");
        List<Integer> playerList = Arrays.asList(
                l.nextInt(),
                l.nextInt(),
                l.nextInt(),
                l.nextInt()
        );

        List<Integer> chosenNumbers = populateAndShuffleList();

        System.out.println("Números sorteados: ");
        for (Integer numb: chosenNumbers
             ) {
            System.out.println(numb);
        }

    }
        public static List<Integer> populateAndShuffleList() {
           Stack<Integer> numbersList = new Stack<>();
           int[] numbersIndex = new int[21];

            for (int i = 0; i < numbersIndex.length; i++) {
                numbersList.push(i);
            }

            Collections.shuffle(numbersList);
            
            List<Integer> chosenNumbers = new ArrayList<>();
            chosenNumbers.add(numbersList.pop());
            chosenNumbers.add(numbersList.pop());
            chosenNumbers.add(numbersList.pop());
            chosenNumbers.add(numbersList.pop());

            return chosenNumbers;
        }
    }

