import java.util.Scanner;
public class ConsumoMedio {
	public static void main (String[]args) {
		double disPer, comPer, cM;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite a dist�ncia percorrida pelo autom�vel durante a viagem, em quil�metros:");
		disPer=ler.nextDouble();
		System.out.println ("Digite o total de combust�vel gasto no caminho, em litros:");
		comPer=ler.nextDouble();
		cM=disPer/comPer;
		System.out.println ("O consumo m�dio do autom�vel durante a viagem � "+cM+" km/litro.");
		ler.close();
	}

}
