//Ejercicio 8
//Q8: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 32;
    for (int i = n; i >= 1; i = i / 2)
    {
        std::cout << i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = n a i>=1, i=n/(2^(la cantidad de veces que se ejecute con i y la condición = k)), aplicando propiedades logarítmicas log n en base 2 
    O(log n) --> Complejidad logarítmica
*/