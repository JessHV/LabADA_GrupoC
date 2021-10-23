#Ejercicio 1

'''
Ejemplo del profesor
Convertir esta funsión de O(n^2) a una funsión de O(n)
'''
def greatestNumber(array):
    for i in array:
        isIValTheGreatest = True
        for j in array:
            if j > i:
                isIValTheGreatest = False
        if isIValTheGreatest:
            return i


'''
Función de O(n)
'''
def theGreatestNumber(array):
#Esta función solo usará un for para recorrer y comparar los elementos del array y encontrar el de mayor valor
#Complejidad temporal/algorítmica: O(n)
    mayor = array[0]
    for i in range (len(array)):
        if array[i] > mayor:
            mayor = array[i]
    return mayor


'''
Caso prueba
'''
print(theGreatestNumber([1, 12, 3, 4, 5, 6, 7, 8, 9, 10]))
