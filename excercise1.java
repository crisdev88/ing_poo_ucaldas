package poo;
import java.util.*;
public class excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese su animal favorito");
		String  myAnimal = keyboard.nextLine();
		
		
		if (myAnimal.equalsIgnoreCase("tortuga")) {
			
			System.out.println("También me gustan las tortugas");
			
		}else		
		{
			System.out.println("Ese animal es genial, pero prefiero las tortugas");
		}
	}

}
