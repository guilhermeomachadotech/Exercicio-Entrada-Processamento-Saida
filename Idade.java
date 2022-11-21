import java.util.Scanner;
public class Idade {
	public static void main (String[]args) {
		short atual, aNasc, idade;
		Scanner ler=new Scanner(System.in);
		System.out.println("Digite o ano atual:");
		atual=ler.nextShort();
		System.out.println("Digite o ano de nascimento:");
		aNasc=ler.nextShort();
		idade=(short)(atual-aNasc);
		System.out.println ("Sua idade é "+idade+".");
		ler.close();
	}

}
