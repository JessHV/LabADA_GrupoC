
class Main{
  public static void main(String[] args){
    int a[] = {1,2,3,4,5,6,7};
    
    System.out.print("\tCasos prueba");

    //Caso prueba de Ejercicio 1
    System.out.println("\n\nEjercicio 1:");
    System.out.print(sumElemArray(a));
    
    //Caso prueba de Ejercicio 2
    System.out.println("\n\nEjercicio 2:");
    for(int x : inverseArray(a))
      System.out.print(x+" ");
    
    //Caso prueba Ejercicio 3
    System.out.println("\n\nEjercicio 3:");
    parEimpar(a);
    
    //Caso prueba de Ejercicio 4
    System.out.println("\n\nEjercicio 4:");
    int b[] = {12,5,4,6,2,7,1,0};
    for(int x : ordAsc(b))
      System.out.print(x+" ");

    //Caso prueba de Ejercicio 5 
    System.out.println("\n\nEjercicio 5:");
    imprime("Hola mundo!");
    
    
    //Caso prueba de Ejercicio 6 
    System.out.println("\n\nEjercicio 6:");
    imprime("Hola mundo!", 0);
  }


  //Ejercicio 1
  public static int sumElemArray(int [] array){
    //Se crea una variable para que almacene la suma de los elementos del array recorridos por el forEach
    int sum = 0;
    for(int x: array){
      sum+= x; 
    }
    return sum;
  }


  //Ejercicio 2
  public static int [] inverseArray(int [] array){
    //Se crea un nuevo array para almacenar nuevos datos del array
    int [] arrayInv = new int[array.length];
    //El for le da a arrayInv los valores inversos del array, contando este desde el final hasta el elemento 0
    for(int i = 0, cont = array.length; i < array.length; i++){
      arrayInv[i] = array[cont-1];
      cont--;
    }
    return arrayInv;
  }


  //Ejercicio 3
  public static void parEimpar(int [] array){
    int cont = 0;
    //Se cuentan cuantos elementos impares hay
    for(int x: array){
      if(x % 2 != 0)
        cont++;
    }
    //Se crean los 2 arrays para impares y pares
    int [] impar = new int[cont];
    int [] par = new int[array.length - cont];
    //Se ponen los enteros en sus respectivos arrays dependiendo de si su modulo igual o diferente a 0
    int contImpar = 0, contPar = 0;
    for(int x: array){
      if(x % 2 != 0){
        impar[contImpar] = x;
        contImpar++;
      }
      else{
        par[contPar] = x;
        contPar++;
      }
    }
    //Se imprimen a los arrays de pares e impares ya que el método no retorna ningún elemento
    System.out.print("Pares: ");
    for(int x: par)
      System.out.print(x + " ");

    System.out.print("\nImpares: ");
    for(int x: impar)
      System.out.print(x + " ");
  }


  //Ejercicio 4
  public static int [] ordAsc(int [] array){
    
    for (int i=1; i < array.length; i++) {
         int aux = array[i];
         int j;
         for (j=i-1; j >= 0 && array[j] > aux; j--){
              array[j+1] = array[j];
          }
         array[j+1] = aux;
    }
    return array;
  } 


  //Ejercicio 5
  public static void imprime(String msg){
    //El 1er y 2do for se encargan de crear las filas y columnas de la parte superior y central del recuadro de asteriscos 
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < (msg.length() + 4); j++){
        //parte superior
        if(i == 0){
          System.out.print("*");
          continue;
        }
        //los margenes con asteriscos de la parte central 
        if((j == 0 || j == (msg.length() + 3)))
          System.out.print("*");
        //Estos if permiten imprimir el mensaje sin afectar el recuadro, imprimiendo solo en las partes donde no aparece el texto
        else if(i == 2 && j == 2)
            System.out.print(msg);
          else if(i == 2 && (1 < j && j < (msg.length() + 2)))
              continue;
            else
              System.out.print(" ");
      }
      System.out.println();
    }
    //Parte inferior
    for(int i = 0; i < (msg.length() + 4); i++){
      System.out.print("*");
    }
  }


  //Ejercicio 6
  public static void imprime(String msg,int num){
    //La condicionante evalua si el número de espacios dados es positivo
    if(num >= 0){
      //El 1er y 2do for se encargan de crear las filas y columnas de la parte superior y central del recuadro de asteriscos de acuerdo al 2do parametro, que indica las filas entre la parte inferior/superior del texto, 
      for(int i = 0; i < (num * 2 + 2); i++){
        for(int j = 0; j < (msg.length() + 4); j++){
          //parte superior
          if(i == 0){
            System.out.print("*");
            continue;
          }
          //los margenes con asteriscos de la parte central
          if((j == 0 || j == (msg.length() + 3)))
            System.out.print("*");
          else if(i == (num + 1) && j == 2)
              System.out.print(msg);
            else if(i == (num + 1) && (1 < j && j < (msg.length() + 2)))
                continue;
              else
                System.out.print(" ");
        }
        System.out.println();
      }
      //Parte inferior
      for(int i = 0; i < (msg.length() + 4); i++){
        System.out.print("*");
      }
    }
    else 
      System.out.print("Número no valido, debe ser impar");
  }

}