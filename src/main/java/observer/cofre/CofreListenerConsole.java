package observer.cofre;

import java.util.Date;

public class CofreListenerConsole implements CofreAbertoListener, CofreFechadoListener {

	@Override
	public void cofreFoiAberto() {
		System.out.println("COFRELISTENERCONSOLE DIZ: >> Cofre foi aberto em: " + (new Date()).toLocaleString());
	}

	@Override
	public void cofreFoiFechado() {
		System.out.println("COFRELISTENERCONSOLE DIZ: >> Cofre foi fechado em: " + (new Date()).toLocaleString());
	}

}
