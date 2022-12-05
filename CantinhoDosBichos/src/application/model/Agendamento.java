package application.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Agendamento {

	private int idAgendamento;
	private LocalDate dataAgendada;
	private LocalTime horario;
	private String servico;
	private Cliente cliente;
	public int getIdAgendamento() {
		return idAgendamento;
	}
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	public LocalDate getDataAgendada() {
		return dataAgendada;
	}
	public void setDataAgendada(LocalDate dataAgendada) {
		this.dataAgendada = dataAgendada;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "[idAgendamento=" + idAgendamento + ", dataAgendada=" + dataAgendada + ", horario=" + horario
				+ ", servico=" + servico + ", cliente=" + cliente + "]";
	}
	
	
}
