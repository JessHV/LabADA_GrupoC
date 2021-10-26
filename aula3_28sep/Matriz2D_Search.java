

//Ejercicio 2
public class Matriz2D_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CASO PRUEBA
		int [][] matriz = crearMatriz(4,3);
		System.out.println(matrizSearch(matriz, 8));
		imprimir(matriz);
	}
	
	public static boolean matrizSearch(int[][] mat, int num) {
		// Busqueda binaria de "num" de una matriz con elementos ordenados "mat"
		// Si la encuentra retornará TRUE, de lo contrario, False
		int cantFil = mat.length, cantCol = mat[0].length;
		int ini = 0, fin = cantFil * cantCol - 1, med;
		
		while(ini <= fin) { 
			med = (ini+fin)/2;
			if(mat[med/cantCol][med%cantCol] == num) {
				return true;
			}else if(mat[med/cantCol][med%cantCol] < num)
				ini = med + 1;
			else {
				fin = med - 1;
			}
		}
		return false;
	}
	
	public static int[][] crearMatriz(int fil, int col) {
		//Retorna una matriz con datos ordenados, según las filas y columnas asignadas
		int [][] arr = new int[fil][col];
		int con = 0;

		for(int x = 0; x < fil; x++) {
			for(int y = 0; y < col; y++) {
				arr[x][y] = con;
				con++;
			}
		}
		return arr;
	}

	public static void imprimir(int [][]arr) {
		//Imprime la matriz
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}
	
}
