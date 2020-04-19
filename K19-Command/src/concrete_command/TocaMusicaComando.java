package concrete_command;

import receiver.Player;

import command.Comando;

public class TocaMusicaComando implements Comando{

	private Player player;
	private String file;
	
	public TocaMusicaComando(Player player, String file) {
		this.player = player;
		this.file = file;
	}

	@Override
	public void executa() {
		try {
			player.play(file);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
