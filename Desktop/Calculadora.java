package git;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner (System.in);
 do{
	 	System.out.println("Ingrese su operaciÃ³n /n 2 para sumar /n 1 para restar /n 4 para multiplicar /n 3 para dividir");
	 	opcion = teclado.nextInt();
 	}while(opcion < 1 && opcion > 4);
 			System.out.println("Ingrese el primer numero");
 a = teclado.nextInt();
 System.out.println("Ingrese el segundo numero");
 b = teclado.nextInt();
 	
 	switch (opcion) {
	case 2:
		resultado = a + b;
		System.out.println("El resultado es " +resultado);
		break;

	case 1:
		resultado = a - b;
		System.out.println("El resultado es " +resultado);
		break;
	case 4: 
		resultado = a * b;
		System.out.println("El resultado es " +resultado);
		break;
	case 3:
		resultado = a / b;
		System.out.println("El resultado es " +resultado);
		break;
	default:
		break;
	}
 	

 	
	}
}