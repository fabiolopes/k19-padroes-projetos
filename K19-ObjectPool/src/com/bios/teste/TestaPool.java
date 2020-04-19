package com.bios.teste;

import com.bios.interfaces.Pool;
import com.bios.model.Funcionario;
import com.bios.model.Sala;
import com.bios.pools.FuncionarioPool;
import com.bios.pools.SalaPool;

public class TestaPool {
	public static void main(String[] args) {
		Pool<Funcionario> pool = new FuncionarioPool();
		Funcionario funcionario = pool.acquire();
		while (funcionario != null){
			System.out.println(funcionario.getNome());
			funcionario = pool.acquire();
		}
		
		Pool<Sala> salaPool = new SalaPool();
		Sala sala = salaPool.acquire();
		while(sala != null){
			System.out.println(sala.getId());
			sala = salaPool.acquire();
		}
	}
}
