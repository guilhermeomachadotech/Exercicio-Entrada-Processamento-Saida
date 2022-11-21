import java.util.Scanner;
public class Ipva {
	public static void main (String[]args) {
		double precoVeiculo, ipva;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o preço do veículo que está com o IPVA de 4%:");
		precoVeiculo=ler.nextDouble();
		ipva=(precoVeiculo*4)/100;
		System.out.println ("O IPVA do veículo é de R$"+ipva+".");
		ler.close();
	}

}
