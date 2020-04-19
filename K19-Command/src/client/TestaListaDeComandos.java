package client;

import concrete_command.AumentaVolumeComando;
import concrete_command.DiminuiVolumeComando;
import concrete_command.TocaMusicaComando;
import invoker.ListaDeComandos;
import receiver.Player;

public class TestaListaDeComandos {
	public static void main(String[] args) {
		Player player = new Player();
		ListaDeComandos listaDeComandos = new ListaDeComandos();
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica1.mp3"));
		listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica2.mp3"));
		listaDeComandos.adiciona(new DiminuiVolumeComando(player, 2));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica3.mp3"));
		
		listaDeComandos.executa();
	}
}
