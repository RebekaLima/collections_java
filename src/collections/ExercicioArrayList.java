package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 1; i ==5; i++) {
			System.out.print("Você digitará 5 cores.");
			System.out.print("\nDigite a " + i + "ª cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
			
		}
		
		System.out.println("As cores digitadas foram: ");
		for (String cor : cores) {
            System.out.println(cor);
        }
		
		Collections.sort(cores);
		
		System.out.println("\nAs cores digitadas em listagem ordenada:");
        for (String cor : cores) {
            System.out.println(cor);
        }

	}

}
	
