import java.util.Scanner;
public class TrocaValores {
	public static void main (String[]args) {
		double a, b, c;
		Scanner ler=new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero:");
		a=ler.nextDouble();
		System.out.println("Digite o segundo valor:");
		b=ler.nextDouble();
		System.out.println("Esses s�o os valores em suas posi��es originais:"+a+" e "+b+".");
		c=a;
		a=b;
		b=c;
		System.out.println ("Esses s�o os valores em posi��es trocados:"+a+" e "+b+".");
		ler.close();
	}

}
