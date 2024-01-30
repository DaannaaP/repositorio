package bucles;
import java.util.Scanner;

//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
//El programa debe informar de cuántos números introducidos son mayores que 0,
//menores que 0 e iguales a 0.

public class Ejercicio2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int array[];
		int numero;
		System.out.print("Introduce la cantidad de numeros a evaluar: ");
		x=sc.nextInt();
		array=new int[x];
		for(int i=0; i<array.length;i++) {
			System.out.println("Introduce el número"+(i+1)+": ");
			numero=sc.nextInt();
			array[i]=x;
		}
		for(int i=0; i<array.length;i++) {
			if(i<0) {
				System.out.println("El número "+i+ " es menor a 0");
			}else if(i>0) {
				System.out.println("El número "+i+ " es mayor a 0");
			}else if(i==0) {
				System.out.println("El número "+i+ " es igual a 0");
			}
		}
		sc.close();
	}
}
