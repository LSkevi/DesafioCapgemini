import java.util.Scanner;
/**
 * @author Lucas Stankevicius
 * Ultima atualização: 14/02/2022
 * 
 */
public class Escada {
	/**
#Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. 
A última linha não deve conter nenhum espaço.
 */
	
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
	
	

