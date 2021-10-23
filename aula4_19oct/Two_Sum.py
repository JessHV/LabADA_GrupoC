#Ejercicio 3

'''
Complejidad temporal/algorítmica: O(n^2)
'''
def twoSum(array):
#Esta funsión recorre el array para encontrar si hay 2 numeros que sumados den 10
  for i, x in enumerate(array):
    for j, y in enumerate(array):
      if i != j and x + y == 10:
        return True
  return False


'''
Caso prueba
'''
twoSum([1,2,3,5,6]) #No hay 2 números que sumen 10, FALSE
twoSum([1,4,2,3,5,6]) #6+4=10, TRUE