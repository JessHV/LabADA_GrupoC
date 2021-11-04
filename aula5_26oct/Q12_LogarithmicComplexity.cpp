//Ejercicio 12
//Q12: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main()
{
    int n = 20;
    for (int i = 0; i < n; i++)
    {
        for (int j = 1; j < n; j = j * 2)
        {
            std::cout << i << " - " << j << "\n";
        }
    }

    return 0;
}

/* 
Complejidad en tiempo:
    El for interno tiene complejidad log n en base 2, que se repetirá n veces por el 2do for
    O(n*log n) --> Complejidad logarítmica por n
*/