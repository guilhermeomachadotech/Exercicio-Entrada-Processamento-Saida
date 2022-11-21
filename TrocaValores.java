import java.util.Scanner;
public class TrocaValores {
	public static void main (String[]args) {
		double a, b, c;
		Scanner ler=new Scanner (System.in);
		System.out.println("Digite o primeiro número:");
		a=ler.nextDouble();
		System.out.println("Digite o segundo valor:");
		b=ler.nextDouble();
		System.out.println("Esses são os valores em suas posições originais:"+a+" e "+b+".");
		c=a;
		a=b;
		b=c;
		System.out.println ("Esses são os valores em posições trocados:"+a+" e "+b+".");
		ler.close();
	}

}
