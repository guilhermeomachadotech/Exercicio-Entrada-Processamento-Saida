import java.util.Scanner;
public class AreaTriangulo {
	public static void main (String[]args) {
		double b,h,area;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite a base do triângulo:");
		b=ler.nextDouble();
		System.out.println("Digite a altura do triângulo:");
		h=ler.nextDouble();
		area=(b*h)/2;
		System.out.println ("A área do triângulo é="+area+".");
		ler.close();
	}

}
