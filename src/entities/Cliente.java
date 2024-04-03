package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private String Nome;
	private String Email;
	private Date Nascimento;
	
	public Cliente() {		
	}
	
	
	public Cliente(String nome, String email, Date nascimento) {

		Nome = nome;
		Email = email;
		Nascimento = nascimento;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getNascimento() {
		return Nascimento;
	}

	public void setNascimento(Date nascimento) {
		Nascimento = nascimento;
	}
	
	@Override
	public String toString() {
		return Nome + " (" + sdf.format(Nascimento) + ") - " + Email;
	}

}
