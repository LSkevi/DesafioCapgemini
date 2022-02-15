import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[]args){
    	ArrayList<String> lista = new ArrayList<String>();
    	int totalDeAnagramas;
    	System.out.println("======Super Teste de Anagramas======");
    	System.out.print("Introduza a palavra a ser testada: ");
    	Scanner ler = new Scanner(System.in);
    	String anagrama = ler.next();
    	lista = quebraPalavra(anagrama);
    	
    	System.out.println("Analisando sua palavra....");
    	
    	System.out.println(lista);
    	
    	
    	totalDeAnagramas = detectorAnagrama(lista);
    	System.out.println("Foi encontrado um total de " + totalDeAnagramas+" anagrama(s)!");
    	
    	ler.close();
    
    }   
    
    public static ArrayList<String> quebraPalavra(String pala) {
    	ArrayList<String> lista = new ArrayList<>();    	
    	for(int rep = 0; rep<pala.length();rep++) {
    		
    		for (int subs = rep + 1; subs<= pala.length();subs++) {
    			
    			lista.add(pala.substring(rep,subs));}
    		
    		}    	
	return lista;
		}
    
    public static int detectorAnagrama(ArrayList<String> lista) {
    	int numDeAnagram = 0;
    		for(int rep = 0; rep<lista.size();rep++) {
    			for (int subs = rep + 1; subs< lista.size();subs++) {
    				char[] letrainic = lista.get(rep).toCharArray();
    				
    				char[] letrafinal = lista.get(subs).toCharArray();
    				
    				Arrays.sort(letrainic);
    				Arrays.sort(letrafinal);
    				
    				   				
    				if(Arrays.equals(letrainic, letrafinal)) {
    					
    					numDeAnagram++;
    			}
    		}    		
    	}
    		   	
    	return numDeAnagram;
   }
 }
