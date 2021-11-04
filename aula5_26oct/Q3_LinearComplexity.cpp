//Ejercicio 3
//Q3: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 20;
    for (int i = 0; i < n; i = i + 2)
    {
        std::cout << i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = 0  a i = 19 de 2 en 2, n/2 = n * 1/2
    O(n) --> Complejidad lineal
*/