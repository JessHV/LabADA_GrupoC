#Ejercicio 2

'''
Complejidad temporal/algorítmica: O(n^2)
'''
def every_other(array):
#Esta función recorre el array(1er for) para encontrar los multiplos de 2 e imprimir la suma de estos con todos los otros elementos del array(2do for)  
  for i in range (0, len(array)):                            #O(3n*n) = O(n^2)
    if i % 2 == 0:                                  #O(3n)   #
      for j in array:                       #O(n)   #        #
        print(array[i]+ j, "\n")    #O(2)   #       #        #
      print("\n")                   #O(1)   #       #        #
    

'''
Caso prueba
'''
every_other([0, 1, 2, 3])
