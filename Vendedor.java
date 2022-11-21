import java.util.Scanner;
public class Vendedor {
	public static void main (String[]args) {
		String nomeVendedor;
		double salarioFixo, valorVendas, porcenComissao, comissao, salarioFinal;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite o nome do vendedor:");
		nomeVendedor=ler.next();
		System.out.println ("Digite o salário fixo do vendedor:");
		salarioFixo=ler.nextDouble();
		System.out.println ("Digite o valor total de vendas do vendedor por mês:");
		valorVendas=ler.nextDouble();
		porcenComissao=(valorVendas*15)/100;
		comissao=valorVendas-porcenComissao;
		salarioFinal=salarioFixo+comissao;
		System.out.println ("O nome do vendedor é "+nomeVendedor+" e o seu salário fixo é de R$"+salarioFixo+".Como a comissão do vendedor é de 15% sobre o valor do total de vendas, o salário final do vendedor é "+salarioFinal+".");
		ler.close();
	}

}
