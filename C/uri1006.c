#include <stdio.h>
int main() {
    float A, B, C;

    scanf("%f", &A);
    scanf("%f", &B);
    scanf("%f", &C);

    float MEDIA = A / 10 * 2 + B / 10 * 3 + C / 10 * 5;

    printf("MEDIA = %.1f\n", MEDIA);

    return 0;
}