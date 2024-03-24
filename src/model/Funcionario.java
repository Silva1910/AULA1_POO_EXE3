package model;

public class Funcionario {
	private String nome;
	private static Double salario;
	private String cargo;

	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioLiquido(double descontos, double beneficios) {
	    double salarioLiquido = Funcionario.getSalario() - descontos + beneficios;
	    
	    if (salarioLiquido < 1412.00) {
	        throw new RuntimeException("O valor do salário líquido do " + getNome() + " não pode ser menor que 1412.00");
	    } else {
	        return salarioLiquido;
	    }
	}

}


	
		


