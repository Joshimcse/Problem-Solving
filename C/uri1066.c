#include <stdio.h>
int main() {
    int i = 0, even = 0, odd = 0, positive = 0, negative = 0, value[5];

    while (i < 5) {
        scanf("%d", &value[i]);

        if (value[i] % 2 == 0) {
            even++;
        } else if (value[i] % 2 == 1 || value[i] % 2 == -1) {
            odd++;
        }

        if (value[i] > 0) {
            positive++;
        } else if (value[i] < 0) {
            negative++;
        }
        i++;
    }

    printf("%d valor(es) par(es)\n", even);
    printf("%d valor(es) impar(es)\n", odd);
    printf("%d valor(es) positivo(s)\n", positive);
    printf("%d valor(es) negativo(s)\n", negative);

    return 0;
}