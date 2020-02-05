#include <stdio.h>
int main() {
    int X;
    float Y;

    scanf("%d", &X);
    scanf("%f", &Y);

    float average = X / Y;

    printf("%.3f km/l\n", average);

    return 0;
}
