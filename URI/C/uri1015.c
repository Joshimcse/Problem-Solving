#include <stdio.h>
#include <math.h>

int main() {
    double X1, X2, Y1, Y2;

    scanf("%lf", &X1);
    scanf("%lf", &Y1);
    scanf("%lf", &X2);
    scanf("%lf", &Y2);

    double Distance = sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));

    printf("%.4lf\n", Distance);

    return 0;
}
