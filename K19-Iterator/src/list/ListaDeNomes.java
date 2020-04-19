package list;

import java.util.Iterator;

public class ListaDeNomes implements Iterable<String>{
	private String[] nomes;
	private int lenght;
	
	public ListaDeNomes(String[] nomes) {
		super();
		this.nomes = nomes;
		this.lenght = this.nomes.length;
	}
	
	public Iterator<String> iterator(){
		return this.new ListaDeNomesIterator();
	}
	
	private class ListaDeNomesIterator implements Iterator<String>{

		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return (this.i) < ListaDeNomes.this.lenght;
		}

		@Override
		public String next() {
			return ListaDeNomes.this.nomes[i++];
		}

		@Override
		public void remove() {
			ListaDeNomes.this.nomes[i] = null;
			for(int j = i; (j+1) < ListaDeNomes.this.lenght; j++){
				ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j+1];
			}
			ListaDeNomes.this.lenght--;
		}
		
	}
	
	
}
