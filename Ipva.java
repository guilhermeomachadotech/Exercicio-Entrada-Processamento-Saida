import java.util.Scanner;
public class Ipva {
	public static void main (String[]args) {
		double precoVeiculo, ipva;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o pre�o do ve�culo que est� com o IPVA de 4%:");
		precoVeiculo=ler.nextDouble();
		ipva=(precoVeiculo*4)/100;
		System.out.println ("O IPVA do ve�culo � de R$"+ipva+".");
		ler.close();
	}

}
