#Ejercicio 2

'''
Complejidad temporal/algorítmica: O(n)
    Ya que recorre toda la longitud de num
'''
def binarySearchMayOrEqu(A, num):
   L = 0
   R = len(A) - 1
   while(L <= R):
     mid = L + (R - L) // 2
     if A[mid] == num:
       return num
     elif A[mid] < num:
       L = mid + 1
     else:
       R = mid - 1 
   return A[L]


'''
Caso prueba
'''
A=[2,3,5,6,8,10,12]
print(binarySearchMayOrEqu(A,11))