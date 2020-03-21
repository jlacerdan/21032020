package observer.cofre;

import java.util.HashSet;
import java.util.Set;

public class Cofre {
	private Set<CofreAbertoListener> listenersAberto = new HashSet<>();
	private Set<CofreFechadoListener> listenersFechado = new HashSet<>();
	
	public void fechar() {
		System.out.println("fechar()");
		//cofre foi fechado!
		for (CofreFechadoListener listener : this.listenersFechado) {
			listener.cofreFoiFechado();
		}
	}
	
		
	public void abrir() {
		System.out.println("abrir()");
		//cofre foi aberto!
		for (CofreAbertoListener listener : this.listenersAberto) {
			listener.cofreFoiAberto();
		}
	}

	public void adicionarListenerAberto(CofreListenerConsole listener) {
		this.listenersAberto.add(listener);
	}

	public void adicionarListenerFechado(CofreListenerConsole listener) {
		this.listenersFechado.add(listener);
	}

}
