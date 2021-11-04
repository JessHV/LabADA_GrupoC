//Ejercicio 5
//Q5: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 20;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            std::cout << "*";
        }
        std::cout << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    
    O(n^2) --> Complejidad cuadrática
*/