#include <stdio.h>
int main() {
    int odd, X;
    scanf("%d", &X);

    for (odd = 1; odd <= X; odd++) {
        if (odd % 2 == 1) {
            printf("%d\n", odd);
        }
    }

    return 0;
}