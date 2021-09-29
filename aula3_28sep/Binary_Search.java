package ADA_lab;

//Ejercicio 1

public class Binary_Search {

	public static void main(String[] args) {
		
		//CASO PRUEBA
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 14, 16, 20, 22};
		System.out.println(binarySearch(num, 1));
	}
	
	public static boolean binarySearch(int [] arr, int n) {
		//Busqueda binaria de "n" en un array ordenado "arr" 
		//Si la encuentra retornará TRUE, de lo contrario, False
		int cant = arr.length; //Tamaño del array
		int ini = 0, fin = cant - 1, med;
		
		while(ini <= fin) {
			med = (ini + fin) / 2;
			if(arr[med] == n) {
				return true;
			}else if(arr[med] < n){
				ini = med + 1;
			}else {
				fin = med - 1;
			}
		}
		return false;
	}
	
}
