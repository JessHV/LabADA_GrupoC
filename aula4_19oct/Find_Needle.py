#Ejercicio 4

'''
Complejidad temporal/algorítmica: O(n^2)
'''
def find_needle(needle, haystack):
#Esta función recorrerá cada caracter del haystack para compararlo con el needle, 1er caracter  
#Si hay equivalencia, se entra al 2do for para comparar con los caracteres de needle
  if(len(needle) <= len(haystack)):
  #Verifica que el needle sea del mismo tamaño o menor que el haystack
    for i in range(len(haystack)):
      if haystack[i] == needle[0]:
        for j in range(len(needle)):
          if haystack[j+i] == needle[j]:
            #print("Caracter igual\n")
            if(j == len(needle)-1):
              return True
          else:
            #print("Caracter diferente\n")
            break
      continue
    return False
  return False


'''
Caso prueba
'''
print(find_needle("fgh", "abcdefgh"))
