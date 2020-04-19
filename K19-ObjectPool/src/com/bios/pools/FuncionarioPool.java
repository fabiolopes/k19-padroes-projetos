package com.bios.pools;

import java.util.ArrayList;
import java.util.List;

import com.bios.interfaces.Pool;
import com.bios.model.Funcionario;

public class FuncionarioPool implements Pool<Funcionario>{

	private List<Funcionario> funcionarios;
	
	public FuncionarioPool(){
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Marcelo Martins"));
		this.funcionarios.add(new Funcionario("Rafael Cosentino"));
		this.funcionarios.add(new Funcionario("Jonas Hirata"));
	}
	
	@Override
	public Funcionario acquire() {
		if(this.funcionarios.size() > 0){
			return this.funcionarios.remove(0);
		}else{
			return null;
		}
	}

	@Override
	public void release(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		
	}

}
