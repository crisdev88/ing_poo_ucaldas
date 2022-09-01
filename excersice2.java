package poo;

import java.util.Scanner;

public class excersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 6");
		int  myNumber = keyboard.nextInt();
		
		 switch (myNumber){

	         case 1:{
	
	             System.out.println("Hoy aprenderemos sobre prorgamación");
	
	             break;
	
	         }
	         case 2:{
	        		
	             System.out.println("¿Qué tal tomar un curso de marketing digital?");
	
	             break;
	
	         }
	         case 3:{
	        		
	             System.out.println("Hoy es un gran día para comenzar a aprender de diseño");
	
	             break;
	
	         }
	         case 4:{
	        		
	             System.out.println("¿Y si aprendemos algo de negocios online?");
	
	             break;
	
	         }
	         case 5:{
	        		
	             System.out.println("Veamos un par de clases sobre producción audiovisual");
	
	             break;
	
	         }
	         
	         case 6:{
	        		
	             System.out.println("Tal vez sea bueno desarrollar una habilidad blanda en Platzi");
	
	             break;
	
	         }
		
		 }
	}

}
