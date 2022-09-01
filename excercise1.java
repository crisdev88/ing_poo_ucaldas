package poo;
import java.util.Scanner;

public class excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String animal = solicitarAnimal();
		
		String mensaje = evaluarAnimal(animal);
		
		System.out.println(mensaje);
		
	}
	
	
	public static String evaluarAnimal(String animal) {	
		
		
		
		if (animal.equalsIgnoreCase("tortuga")) {		 
			
			  
			  return "También me gustan las tortugas";
			  
		}else		
		{
			return "Ese animal es genial, pero prefiero las tortugas";
		}		
		
	}
	
	public static String solicitarAnimal() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese un animal");
		String  animal = keyboard.nextLine();
		
		
		return animal;
	}

}
