#include <stdio.h>
int main() {
    int N, N100, N50, N20, N10, N5, N2, N1;
    scanf("%d", &N);
    printf("%d\n", N);
    N100 = N / 100;
    N %= 100;
    N50 = N / 50;
    N %= 50;
    N20 = N / 20;
    N %= 20;
    N10 = N / 10;
    N %= 10;
    N5 = N / 5;
    N %= 5;
    N2 = N / 2;
    N %= 2;
    N1 = N;

    printf("%d nota(s) de R$ 100,00\n", N100);
    printf("%d nota(s) de R$ 50,00\n", N50);
    printf("%d nota(s) de R$ 20,00\n", N20);
    printf("%d nota(s) de R$ 10,00\n", N10);
    printf("%d nota(s) de R$ 5,00\n", N5);
    printf("%d nota(s) de R$ 2,00\n", N2);
    printf("%d nota(s) de R$ 1,00\n", N1);

    return 0;
}