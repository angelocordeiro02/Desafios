import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args){
		Scanner texto = new Scanner(System.in);
		short numero;
		System.out.println("Digite um número Natural: ");
		numero = texto.nextShort();
		texto.close();
		short fatorial = 1;
		short numeroReal = numero;
		while(numero > 1) {
			fatorial = (short) (fatorial * numero);
			numero = (short) (numero -1);
		}
		System.out.println("O fatorial do numero "+numeroReal+" é igual a "+fatorial+".");
	}
}
