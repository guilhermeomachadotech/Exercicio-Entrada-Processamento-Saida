import java.util.Scanner;
public class QuatroOperacoes {
	public static void main (String[]args) {
		double num1, num2, soma, sub, mult, d;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite um número:");
		num1=ler.nextDouble();
		System.out.println ("Digite o segundo número:");
		num2=ler.nextDouble();
		soma=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		d=num1/num2;
		System.out.println ("A soma de "+num1+" e "+num2+" é="+soma+".");
		System.out.println ("A subtração de "+num1+" e "+num2+" é="+sub+".");
		System.out.println ("A multiplicação de "+num1+" e "+num2+" é="+mult+".");
		System.out.println ("A divisão de "+num1+" e "+num2+" é= "+d+".");
		ler.close();
	}

}
