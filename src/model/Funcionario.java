package model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	private String telefone;
	private Endereco endereco;
	private Date data;
    private int id ;
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String cpf, double salario, String rg, String telefone, Endereco endereco,
			Date data, int id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
		this.data = data;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    
    
    
    
    
    
    
}