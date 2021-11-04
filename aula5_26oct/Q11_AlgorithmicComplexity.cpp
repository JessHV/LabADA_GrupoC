//Ejercicio 11
//Q11: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 6, p = 0;
    for (int i = 1; i < n; i = i * 2)
    {
        p++;
        std::cout << i << " - " << p << "\n";
    }
    for (int j = 1; j < p; j = j * 2)
    {
        std::cout << j << " - " << p << "\n";
    }

    return 0;
}

/* 
Complejidad en tiempo:
    El 1er for tiene complejidad log n en base 2
    El 2do for tiene complejidad log (log n) ambos en base 2
    Sumados y aplicando propiedades logarítmicas = log (n*log n) ambos en base 2
    O(log (n*log n)) --> Complejidad logarítmica
*/