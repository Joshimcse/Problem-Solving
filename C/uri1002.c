#include <stdio.h>

int main() {
    double A, R, Pi = 3.14159;

    scanf("%lf", &R);

    A = (R * R) * Pi;

    printf("A=%.4lf\n", A);

    return 0;
}
