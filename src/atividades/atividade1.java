package atividades;
import java.util.Scanner;
public class atividade1 {

	public static void main(String[] args) {
		float sal,abo,nsa;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		sal = leia.nextFloat();
		
	    System.out.println("Digite o abono:");
		abo = leia.nextFloat();
		
		nsa = (sal+abo);
		
		System.out.println("Novo salário: " + nsa +"");
				
				
		

	}

}
