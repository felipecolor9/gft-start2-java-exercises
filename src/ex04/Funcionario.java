package ex04;

public class Funcionario extends Pessoa {

    private double salario_inicial;
    private double percentual;
    private double salario_final;

    public Funcionario(String nome, String rg, double salario_inicial){
        super(nome,rg);
        this.salario_inicial = salario_inicial;
    }

    public double calcularSalario2021(double percentual, int anoAdmissao) {
        setSalario_final(salario_inicial + ((salario_inicial)/100*percentual));
        double localPercentual = percentual;
        for (int i = anoAdmissao+2 ; i <= 2021; i++) {
            localPercentual*=2;
            setSalario_final(salario_final + ((salario_final)/100*localPercentual));
        }
        return getSalario_final();
    }

    public double getSalario_inicial() {
        return salario_inicial;
    }

    private void setSalario_inicial(double salario_inicial) {
        this.salario_inicial = salario_inicial;
    }

    public double getPercentual() {
        return percentual;
    }

    private void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalario_final() {
        return salario_final;
    }

    private void setSalario_final(double salario_final) {
        this.salario_final = salario_final;
    }
}
