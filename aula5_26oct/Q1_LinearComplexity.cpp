//Ejercicio 1
//Q1: ¿Cuál es la complejidad en tiempo de...?

#include <iostream>

//Caso prueba
int main(){
    for(int i = 0; i < 5; i++) {    //n = 5
        std::cout << i << "\n";
    }
    return 0;
}

/* 
Complejidad en tiempo:
    De i = o  a n = 5
    O(n) --> Complejidad lineal
*/