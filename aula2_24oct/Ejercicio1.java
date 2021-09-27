package ADA_lab;

import java.util.*;

//Ejercicio 1: Busqueda secuencial
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		//Medidores de tiempo
		long tieInicio, tieFin, tiempo;
		tieInicio = System.currentTimeMillis();//Empieza el tiempo de ejecución
		
		Scanner escan = new Scanner(System.in);
		int cantElemArr = 50; //Canntidad de elementos del array
		int numBuscado = 10; //Numero que se buscará en el array
		//Caso prueba
		int [] array = crearArr(cantElemArr);
		System.out.println("Número buscado: " + numBuscado);
		System.out.print(encontrar(array, numBuscado));
		imprimirArr(array);
		
		//Medidores de tiempo
		tieFin = System.currentTimeMillis();
		tiempo = tieFin - tieInicio;
		System.out.println("\nTiempo de ejecución en milisegundos: " + tiempo);
	}
	
	public static boolean encontrar(int[] arr, int num) {
		//El parametro recibe un array para recorrerlo y encontrar el entero num
		for(int x : arr)
			if(x == num)
				return true;
		return false;
	}
	
	public static int [] crearArr(int n) {
		//Crea un array de n elementos y les asigna valores random
		int [] arr  = new int[n];
		for(int x = 0, y; x < n; x++) {
			do {
				y = (int)(Math.random()*100)+1; //Los números random son del 1 al 100
			}
			while(encontrar(arr, y)==true); 
			arr[x] = y;	
		}
		return arr;
	}
	
	public static void imprimirArr(int [] a) {
		//Imprime los elementos del array
		System.out.print("\n{");
		for (int x : a)
			System.out.print(x + " ");
		System.out.print("}");
	}
	
}