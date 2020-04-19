package concrete_command;

import receiver.Player;
import command.Comando;

public class DiminuiVolumeComando implements Comando{

	private Player player;
	private int levels;
	
	public DiminuiVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executa() {
		player.decreaseVolume(levels);
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}
	
}
