import java.util.Scanner;
public class ConsumoMedio {
	public static void main (String[]args) {
		double disPer, comPer, cM;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite a distância percorrida pelo automóvel durante a viagem, em quilômetros:");
		disPer=ler.nextDouble();
		System.out.println ("Digite o total de combustível gasto no caminho, em litros:");
		comPer=ler.nextDouble();
		cM=disPer/comPer;
		System.out.println ("O consumo médio do automóvel durante a viagem é "+cM+" km/litro.");
		ler.close();
	}

}
