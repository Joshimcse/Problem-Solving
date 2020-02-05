#include <stdio.h>
int main() {
    int X, Y, i;
    scanf("%d %d", &X, &Y);
    
    if (X < Y) {
        i = X + 1;
        while (i < Y) {
            if (i % 5 == 2 || i % 5 == 3) {
                printf("%d\n", i);
            }
            i++;
        }
    } else if (X > Y) {
        i = Y + 1;
        while (i < X) {
            if (i % 5 == 2 || i % 5 == 3) {
                printf("%d\n", i);
            }
            i++;
        }
    }
    return 0;
}