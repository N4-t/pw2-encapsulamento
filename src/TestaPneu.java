
public class TestaPneu {

	public static void main(String[] args) {
		
		Bomba bomba = new Bomba();
		
		bomba.setPressaoDesejada(30);
		bomba.setPressaoLida(18);
		
		System.out.println("Pres�o Desejada: " + bomba.getPressaoDesejada());
		System.out.println("Pres�o do Pneu: " + bomba.getPressaoLida());
		System.out.println("Resultado: " + bomba.obterResultado());
	}
}
