import java.util.Scanner;
public class SucessorAntecessorNumero {
	public static void main (String[]args) {
		long numero, ante, suce;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite um n�mero:");
		numero=ler.nextLong();
		ante=numero-1;
		suce=numero+1;
		System.out.println ("O antecessor do n�mero "+numero+" � "+ante+".");
		System.out.println ("O sucessor do n�mero "+numero+" � "+suce+".");
		ler.close();
	}

}
