//Ejercicio 2
//Q2: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 10;
    for (int i = n; i > 0; i--)
    { 
        std::cout << i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = 10  a i = 1, y eso es el valor de n
    O(n) --> Complejidad lineal
*/