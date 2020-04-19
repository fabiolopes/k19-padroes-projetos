package receiver;

public class Player {
	public void play(String filename) throws InterruptedException{
		System.out.println("Tocando o arquivo " + filename);
		long duracao = (long) (Math.random()*2000);
		System.out.println("Dura��o da faixa (seg): "+ duracao/1000.0);
		Thread.sleep(duracao);
		System.out.println("Fim da faixa "+filename);
	}
	
	public void increaseVolume(int levels){
		System.out.println("Aumentando o volume em " + levels);
	}
	
	public void decreaseVolume(int levels){
		System.out.println("Diminuindo o volume em " + levels);
	}
}
