import java.util.Scanner;
/**
 * @author Lucas Stankevicius
 * Ultima atualiza��o: 14/02/2022
 * 
 */
public class Senha {
	/**
	Para ajudar D�bora, 
	construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
	para uma string qualquer ser considerada segura.

	 */
	
	public static void main ( String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
				System.out.print("Insira sua senha: ");
				String senha = ler.next();
				
				if(senha.length()<6) {
					int n = 6- senha.length();
					System.out.println("Sua senha � muito pequena, falta(m) "+ n + " caracter(es)");
				}else {
					System.out.println("Sua senha � segura");					
			}
		}
	}
}
