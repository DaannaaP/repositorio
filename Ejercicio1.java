package bucles;
import java.util.Scanner;
//https://manolohidalgo.com/ejercicios-bucles-en-java/
//Ejercicio 1. Crea una aplicación que permita adivinar un número. 
//La aplicación genera un número aleatorio del 1 al 100. 
//A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
//a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
//El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
//si se llega al limite de intentos te muestra el número que había generado.


//HOLAAAA
//ADIOSSS

public class Ejercicio1 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);	
		int numero = (int) (Math.random() * 100) + 1;
		int num=0;
		int contador=0;
		System.out.println("Bienvenido, vas a insertar números ENTEROS, o explota todo");
		System.out.println("Se ha generado un número aleatorio entre el 1 y el 100, a ver si aciertas");
		do {	
			num=sc.nextInt();
			contador++;
			if(num<numero) {
				System.out.println("El número introducido es menor al correcto");
			}else {
				System.out.println("El número introducido es mayor al correcto");
			}
			if(num==numero) {
				System.out.println("Enhorabuena, lo has conseguido en: "+ contador+" intentos");
				break;
			}
		}while(contador!=10);
		System.out.println("Has fallado, el número era: "+ numero);
		sc.close();
	}	
}
