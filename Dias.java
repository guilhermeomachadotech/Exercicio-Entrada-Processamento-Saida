import java.util.Scanner;
public class Dias {
	public static void main (String[]args) {
		double dia, mes, ano;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o número de dias para serem convertidos em meses e anos:");
		dia=ler.nextDouble();
		mes=dia/30;
		ano=dia/365;
		System.out.println ("Os dias convertidos em meses são "+mes+" e convertidos em anos são "+ano+".");
		ler.close();
	}
}