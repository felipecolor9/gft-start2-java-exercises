package ex04;

/* Crie uma classe abstrata Pai de nome Pessoa, contendo os atributos (nome, rg).
Crie uma Classe Filha chamada Funcionário, contendo os atributos (salario_inicial,
percentual e salario_total) encapsulados, com seus respectivos seletores (getters) e
modificadores (setters).
Criar uma classe principal que instancie o objeto Funcionário com as regras abaixo:
Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe - se que:
Esse funcionário foi contratado em 2018, com salário inicial de R$ 1.000,00. Em 2019,
ele recebeu aumento de 1,5 % sobre seu salário inicial.
A partir de 2020(inclusive), os aumentos salariais sempre corresponderam ao dobro
do percentual do ano anterior.
Faça um programa que informe o Nome, RG e o salário em 2021 desse funcionário.*/

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Felipe Marques","123.456.789-10",1000.00);
        System.out.println("Salário de "+ funcionario.getNome() +" pertencente ao RG: ["+funcionario.getRg()+ "] em 2021: R$"+funcionario.calcularSalario2021(1.5, 2018));
    }
}
