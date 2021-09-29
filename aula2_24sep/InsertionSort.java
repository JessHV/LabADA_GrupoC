package ADA_lab;

//Ejercicio 2
public class InsertionSort {

	public static void main(String[] args) {
		
		//Medidores de tiempo
		long tieInicio, tieFin, tiempo;
		tieInicio = System.currentTimeMillis();//Empieza el tiempo de ejecución
		
		int [] arr = crearArr(8);
		
		imprimirArr(arr);
		insertionSort(arr);
		imprimirArr(arr);
		
		//Medidores de tiempo
		tieFin = System.currentTimeMillis();
		tiempo = tieFin - tieInicio;
		System.out.println("\nTiempo de ejecución en milisegundos: " + tiempo);
	}
	
	public static void insertionSort(int [] arr) {
		for(int j = 1, i; j<arr.length;j++ ) {
			int key = arr[j];
			i = j - 1;
			while(i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
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
