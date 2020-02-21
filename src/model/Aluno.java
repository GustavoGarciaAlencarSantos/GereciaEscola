package model;

/**
 * 
 * @author galencar
 * @since 18/02/2020
 * @version 0.1
 * 
 */
public class Aluno {
	private String nome, matricula;
	private Date dataDenascimento;
	private char sexo;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private String senha;

	public Aluno() {

	}

	public Aluno(String nome, String matricula, Date dataDenascimento, char sexo, String rg, String cpf,
			Endereco endereco, String telefone, String senha) {

		this.nome = nome;
		this.matricula = matricula;
		this.dataDenascimento = dataDenascimento;
		this.sexo = sexo;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataDenascimento() {
		return dataDenascimento;
	}

	public void setDataDenascimento(Date dataDenascimento) {
		this.dataDenascimento = dataDenascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
