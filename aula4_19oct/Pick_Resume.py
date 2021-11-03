#Ejercicio 5

'''
Complejidad temporal/algorítmica: O(n)
'''


def pick_resume(resumes):
#La funsión establece la variable "eliminate" para ver qué mitad de "resumes" guardará en la misma variable
#Retorna el elemento medio que divide "resumes" en partes iguales; ó, si el número de elementos de "resumes" es par, retorna el primer elmento del 2do grupo
    eliminate = "top"
    while len(resumes) > 1:                                                 #O(n-1)
        if eliminate == "top":                                              #O(max(4,3))
            resumes = resumes[len(resumes) // 2: len(resumes) - 1]
            eliminate = "bottom"
        elif eliminate == "bottom":
            resumes = resumes[0: len(resumes) // 2]
            eliminate = "top"
    return resumes[0]                                                       #O(1)


'''
Caso prueba
'''
print(pick_resume("abcdefghijklmnñopqrstuvwxyz012345678"))

print(pick_resume([1, 2, 3, 4, 5, 6, 7, 8]))

#Why does the function only accept those numbers of elements at a string and a list?
