//Ejercicio 9
//Q9: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 32;
    for (int i = 0; i * i < n; i++)
    {
        std::cout << i << "-" << i * i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = 0 a hasta que el i*1>=n
    O(n^(1/2)) --> Complejidad raiz de n
*/