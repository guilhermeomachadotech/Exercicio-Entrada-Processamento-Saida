import java.util.Scanner;
public class SomaQuadrados {
	public static void main (String[]args) {
		double valor1, valor2, valor3, quadri1,quadri2,quadri3,soma;
		Scanner ler=new Scanner(System.in);
		System.out.println ("Digite o primeiro valor:");
		valor1=ler.nextDouble();
		System.out.println ("Digite o segundo valor:");
		valor2=ler.nextDouble();
		System.out.println ("Digite o terceiro valor:");
		valor3=ler.nextDouble();
		quadri1=valor1*valor1;
		System.out.println ("O quadrado de "+valor1+" é: "+quadri1+".");
		quadri2=valor2*valor2;
		System.out.println ("O quadrado de "+valor2+" é: "+quadri2+".");
		quadri3=valor3*valor3;
		System.out.println ("O quadrado de "+valor3+" é: "+quadri3+".");
		soma=quadri1+quadri2+quadri3;
		System.out.println ("A soma dos quadrados de "+valor1+", "+valor2+" e "+valor3+" é: "+soma+".");
		ler.close();
	}

}
