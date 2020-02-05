#include <stdio.h>
int main() {
    int N, i = 0, f = 1;
    scanf("%d", &N);

    i = N;
    while (i > 0) {
        f *= i;
        i--;
    }
    printf("%d\n", f);
    return 0;
}