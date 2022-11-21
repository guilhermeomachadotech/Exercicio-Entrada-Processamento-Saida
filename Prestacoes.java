import java.util.Scanner;
public class Prestacoes {
	public static void main (String[]args) {
		double compra, porcen, desc, valorPrest;
		byte numPrestacoes;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o valor da compra que está com promoção de 10% de desconto:");
		compra=ler.nextDouble();
		System.out.println ("Digite o número de prestações da compra:");
		numPrestacoes=ler.nextByte();
		porcen=(compra*10)/100;
		desc=compra-porcen;
		valorPrest=desc/numPrestacoes;
		System.out.println ("O valor das prestações sobre a compra é R$"+valorPrest+".");
		ler.close();
	}

}
