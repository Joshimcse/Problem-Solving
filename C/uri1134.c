#include <stdio.h>
int main() {
    int alc = 0, gas = 0, die = 0, N;
    
    while (scanf("%d", &N) == 1 && N != 4) {
        switch (N) {
        case 1:
            alc++;
            break;
        case 2:
            gas++;
            break;
        case 3:
            die++;
            break;
        }
    }
    printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alc, gas, die);

    return 0;
}