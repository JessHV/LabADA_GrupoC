#Ejercicio 3

'''
Complejidad temporal/algorítmica: O(log n)
    Ya que recorre la mitad de las veces hasta n, log n en base 2
'''

def SmallestRotatingElement(A):
   L = 0
   R = len(A) - 1
   min = A[L]
   while(L <= R):
     mid = L + (R - L) // 2
     if A[mid] < min:
       min = A[mid]
       R = mid
     else:
       min = A[R]
       L = mid
     if A[mid] == min:
       return min


'''
Caso prueba
'''
A = [6, 7, 9, 15, 19, 2, 3]
print(SmallestRotatingElement(A))
