//Ejercicio 7
//Q7: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 20;
    for (int i = 1; i < n; i = i * 2)
    {
        std::cout << i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = 1 a 2^i >= n, 2^i = n, aplicando propiedades logarítmicas, k = log n en base 2 
    O(log n) --> Complejidad logarítmica
*/