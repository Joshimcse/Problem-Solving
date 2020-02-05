#include <stdio.h>
int main() {
    int p;
    
    while (scanf("%d", &p) == 1) {
        if (p == 2002) {
            printf("Acesso Permitido\n");
            break;
        } else {
            printf("Senha Invalida\n");
        }
    }
    return 0;
}