#include <stdio.h>
int main() {
    int X, Y, i, sum = 0;
    scanf("%d %d", &X, &Y);

    for (i = --X; i > Y; i--) {
        if (i % 2 == 1 || i % 2 == -1) {
            sum += i;
        }
    }
    printf("%d\n", sum);
    
    return 0;
}