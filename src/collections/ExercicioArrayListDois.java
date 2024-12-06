package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayListDois {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		Integer numero = 0;
		String i = "sim";
		Collections.addAll(numeros, 2,5,1,3,4,9,7,8,10,6);
		
		while (!i.equals("não")) {
			
			System.out.print("Digite o número que deseja encontrar: \n");
			numero = leia.nextInt();
			
		if(numeros.contains(numero)) {
			System.out.print("O número " + numero +" foi encontrado!\n");
			
		} else {
			System.out.print("O número " + numero +" não foi encontrado!\n");
		}
		
		System.out.println("\nDeseja digitar mais um número? Responda com 'sim' ou 'não.'");
        i = leia.next();
		
	}
		
		System.out.println("Verificação finalizada.");
	}
		
		
		
		

	}

