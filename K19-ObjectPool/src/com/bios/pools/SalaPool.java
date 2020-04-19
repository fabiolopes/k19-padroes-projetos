package com.bios.pools;

import java.util.ArrayList;
import java.util.List;

import com.bios.interfaces.Pool;
import com.bios.model.Sala;

public class SalaPool implements Pool<Sala>{

	private List<Sala> salas;
	
	public SalaPool(){
		salas = new ArrayList<Sala>();
		salas.add(new Sala("15-A"));
		salas.add(new Sala("31-J"));
		salas.add(new Sala("001"));
	}
	
	@Override
	public Sala acquire() {
		if(salas.size() > 0){
			return this.salas.remove(0);
		}else{
			return null;
		}
	}

	@Override
	public void release(Sala t) {
		salas.add(t);
	}

}
