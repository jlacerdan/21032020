package observer.cofre;

public class AppCofre {
	
	public static void main(String[] args) {
		Cofre cofreSeguro = new Cofre();
		
		cofreSeguro.adicionarListenerAberto(new CofreListenerConsole());
		cofreSeguro.adicionarListenerFechado(new CofreListenerConsole());

		cofreSeguro.abrir();
		cofreSeguro.fechar();

		System.out.println("Fim.");
	}

}
