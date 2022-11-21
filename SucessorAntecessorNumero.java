import java.util.Scanner;
public class SucessorAntecessorNumero {
	public static void main (String[]args) {
		long numero, ante, suce;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite um número:");
		numero=ler.nextLong();
		ante=numero-1;
		suce=numero+1;
		System.out.println ("O antecessor do número "+numero+" é "+ante+".");
		System.out.println ("O sucessor do número "+numero+" é "+suce+".");
		ler.close();
	}

}
