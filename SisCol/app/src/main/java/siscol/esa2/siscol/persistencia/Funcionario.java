package siscol.esa2.siscol.persistencia;

import com.orm.SugarRecord;

import java.io.Serializable;

public class Funcionario extends SugarRecord implements Serializable {
	
	public String Nome;
	public int RG;
	public String Endereco;
	public String Cargo;

	public Funcionario(){}

	public void cadastrarAluno(){
		System.out.println();
	}


	public void cadastrarDisciplina(){
		System.out.println();
	}
	
	
	public void cadastrarSalas(){
		System.out.println();
	}
	
	
	public void cadastrarTurmas(){
		System.out.println();
	}


	public void organizarTurmas(){
		System.out.println();
	}

}

