import java.util.Scanner;
public class QuatroOperacoes {
	public static void main (String[]args) {
		double num1, num2, soma, sub, mult, d;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite um n�mero:");
		num1=ler.nextDouble();
		System.out.println ("Digite o segundo n�mero:");
		num2=ler.nextDouble();
		soma=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		d=num1/num2;
		System.out.println ("A soma de "+num1+" e "+num2+" �="+soma+".");
		System.out.println ("A subtra��o de "+num1+" e "+num2+" �="+sub+".");
		System.out.println ("A multiplica��o de "+num1+" e "+num2+" �="+mult+".");
		System.out.println ("A divis�o de "+num1+" e "+num2+" �= "+d+".");
		ler.close();
	}

}
