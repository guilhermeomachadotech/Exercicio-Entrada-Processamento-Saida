import java.util.Scanner;
public class MParaKm {
	public static void main (String[]args) {
		double metros, km;
		Scanner ler=new Scanner(System.in);
		System.out.println ("Digite uma quantidade de metros a serem convertidos em quil�metros:");
		metros=ler.nextDouble();
		km=metros/1000;
		System.out.println (metros+" metros equivale a "+km+" quil�metros.");
		ler.close();
	}

}
