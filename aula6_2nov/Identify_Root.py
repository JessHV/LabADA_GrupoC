#Ejercicio 1

'''
Complejidad temporal/algorítmica: O(log n)
    Ya que recorre la mitad de las veces hasta n, log n en base 2 
'''
def identificarRaiz(num):
  L = 0
  R = num - 1
  while(L <= R):
    mid = L + (R - L) // 2
    if mid*mid == num:              
      return True
    if mid*mid < num:
      L = mid + 1
    else:
      R = mid - 1
  return False


'''
Caso prueba
'''
print(identificarRaiz(16))
