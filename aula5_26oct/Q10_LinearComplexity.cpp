//Ejercicio 10
//Q10: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 32;
    for (int i = 0; i < n; i++)
    {
        std::cout << i << "\n";
    }
    for (int j = 0; j < n; j++)
    {
        std::cout << j << "\n";
    }

    return 0;
}

/* 
Complejidad en tiempo:
    Son 2 for de 0 a n, 2n
    O(n) --> Complejidad lineal
*/