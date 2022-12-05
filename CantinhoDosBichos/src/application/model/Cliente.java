package application.model;

import java.time.LocalDate;

public class Cliente {

	private String cpf;
	private String nomeCliente;
	private String telefone;
	private String logradouro;
	private String numeroEnd;
	private String cep;
	private LocalDate dataNasc;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroEnd() {
		return numeroEnd;
	}
	public void setNumeroEnd(String numeroEnd) {
		this.numeroEnd = numeroEnd;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	@Override
	public String toString() {
		return "[cpf=" + cpf + ", nomeCliente=" + nomeCliente + ", telefone=" + telefone + ", logradouro="
				+ logradouro + ", numeroEnd=" + numeroEnd + ", cep=" + cep + ", dataNasc=" + dataNasc + "]";
	} 
	
	
	
	
}
