import java.util.Scanner;
public class Dias {
	public static void main (String[]args) {
		double dia, mes, ano;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o n�mero de dias para serem convertidos em meses e anos:");
		dia=ler.nextDouble();
		mes=dia/30;
		ano=dia/365;
		System.out.println ("Os dias convertidos em meses s�o "+mes+" e convertidos em anos s�o "+ano+".");
		ler.close();
	}
}