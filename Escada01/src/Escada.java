import java.util.Scanner;

public class Escada {
	
	
	public static void main (String []args) {
		
	
	try(Scanner ler = new Scanner(System.in)) {
		System.out.print("Insira o valor de n: ");
		
	int n = ler.nextInt();
	
	for(int repetir = 0;repetir < n;repetir++) {
		for(int esp = 1; esp <n - repetir;esp++) {
			System.out.print(" "); }
		
		for (int ast = 0; ast < repetir + 1; ast++){
			System.out.print("*");}
		
	System.out.println();}
		}
	}
}
	
	

