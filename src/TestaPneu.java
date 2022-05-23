
public class TestaPneu {

	public static void main(String[] args) {
		
		Bomba bomba = new Bomba();
		
		bomba.setPressaoDesejada(30);
		bomba.setPressaoLida(18);
		
		System.out.println("Presão Desejada: " + bomba.getPressaoDesejada());
		System.out.println("Presão do Pneu: " + bomba.getPressaoLida());
		System.out.println("Resultado: " + bomba.obterResultado());
	}
}
