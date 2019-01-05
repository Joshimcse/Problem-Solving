#include <stdio.h>
int main() {
    int Code;

    scanf("%d", &Code);

    if (Code == 61) {
        printf("Brasilia\n");
    } else if (Code == 71) {
        printf("Salvador\n");
    } else if (Code == 11) {
        printf("Sao Paulo\n");
    } else if (Code == 21) {
        printf("Rio de Janeiro\n");
    } else if (Code == 32) {
        printf("Juiz de Fora\n");
    } else if (Code == 19) {
        printf("Campinas\n");
    } else if (Code == 27) {
        printf("Vitoria\n");
    } else if (Code == 31) {
        printf("Belo Horizonte\n");
    } else {
        printf("DDD nao cadastrado\n");
    }
    
    return 0;
}
