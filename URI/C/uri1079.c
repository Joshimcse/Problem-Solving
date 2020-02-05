#include <stdio.h>
int main() {
    int N;
    float num1, num2, num3;
    scanf("%d", &N);

    while (N > 0) {
        scanf("%f %f %f", &num1, &num2, &num3);
        printf("%.1f\n", num1 / 10 * 2 + num2 / 10 * 3 + num3 / 10 * 5);
        N--;
    }
    return 0;
}