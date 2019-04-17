package ar.edu.unlam.pb2;
import java.util.Scanner;

public class Calculadora {

	static Integer resultado = 0;
		
	
	 public static void sumaDeValores(Integer a2, Integer b2){
		resultado = a2 + b2;
	 }
	 
	public static void resta (Integer num1, Integer num2) {
		 resultado = num1-num2;
  }
    
  public static void Multiplicacion(Integer a, Integer b) {
		resultado = a * b;
		System.out.println("El resultado es " + resultado.toString());
	}
	

  public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		Integer a=0;
		Integer b=0;
		Integer opcion = null;
		
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
		sumaDeValores(a,b);
		 
		break;
		
	case 2:
		System.out.println("Elegiste la opcion resta");
		resta(a, b);
		break;

	case 3:
		System.out.println("Elegiste la opcion multiplicacion");
		//resultado = a * b;
		Multiplicacion(a,b);
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
 