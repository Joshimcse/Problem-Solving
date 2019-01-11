#include <stdio.h>
int main() {
    int X, Y, i, j, sum = 0;
    scanf("%d %d", &X, &Y);

    i = (X < Y) ? X : Y;
    j = (X < Y) ? Y : X;

    while (i <= j) {
        if (i % 13 != 0) {
            sum += i;
        }
        i++;
    }
    printf("%d\n", sum);
    
    return 0;
}