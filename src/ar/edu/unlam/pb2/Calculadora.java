package ar.edu.unlam.pb2;
import java.util.Scanner;

public class Calculadora {
	private static Scanner teclado;
	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		Integer a=0;
		Integer b=0;
		Integer opcion = null;
		Integer resultado=0;
// do{
//<<<<<<< HEAD
	 System.out.println("Ingrese su operaci�n \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
	 opcion = teclado.nextInt();
//=======
// System.out.println("Ingrese su operacion \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir");
// opcion = teclado.nextInt();
//>>>>>>> Tercer commit
// }while(opcion < 1 && opcion > 4);
 
 System.out.println("Ingrese el primer numero");
 a = teclado.nextInt();
 
 System.out.println("Ingrese el segundo numero");
 b = teclado.nextInt();
//<<<<<<< HEAD
 
 switch (opcion) {
	case 1:
		System.out.println("Elegiste la opcion suma");
		resultado = a + b;
		break;
	case 2:
		System.out.println("Elegiste la opcion resta");
		resultado = a - b;
		break;

	case 3:
		System.out.println("Elegiste la opcion multiplicacion");
		resultado = a * b;
		break;
	case 4:
		System.out.println("Elegiste la opcion division");
		resultado = a / b;
		break;
	}
//=======
// if(opcion.equals(1)){
// resultado = a * b;
// }else if(opcion.equals(2)){
// resultado = a - b;
// }else if(opcion.equals(3)){
// resultado = a + b;
// }else{
// resultado = a / b;
// }
//>>>>>>> Tercer commit
 System.out.println("El resultado es " + resultado.toString());
 }
}
 