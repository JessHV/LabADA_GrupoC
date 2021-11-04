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
    De i = 1 a p + i > 30, hasta que las veces que p se sume al incremento de i y sea menor e igual a n
    las veces hasta que i incrementará = k
    k*(k+1)/2 > n = k*k/2>n = k*k>n => n^(1/2) 
    O(n^(1/2)) --> Complejidad de raiz cuadrada
*/