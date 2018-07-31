package ifc.videira.edu.br;
import java.util.Scanner;

public class Main {
	public static void main (String args[]){ 
       
        Calculadora c = new Calculadora();  
       
        int opcao = 5;  
        int num1;  
        int num2;
        
        Scanner input = new Scanner(System.in);  
		System.out.println("-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Multiplicacao");  
	    System.out.println("4. Divisao");  
	    System.out.println("0. Sair");  
	    System.out.println("Operação: ");  
	    opcao = input.nextInt();

}
}
