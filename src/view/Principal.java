package view;

import model.Funcionario;

public class Principal {
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.setCargo("gerente");
        f.setNome("amos");
        f.setSalario(1500.00);
        double salarioLiquido = f.getSalarioLiquido(500.0, 0.0);
        
        System.out.println("O salário líquido de " + f.getNome() + " como " + f.getCargo() + " é: " + salarioLiquido);
    }
}
