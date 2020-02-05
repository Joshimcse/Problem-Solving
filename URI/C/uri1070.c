#include <stdio.h>
int main() {
    int count = 0, X;
    
    while (scanf("%d", &X) == 1) {
        while (count <= 5) {
            if (X % 2 == 1) {
                count++;
                printf("%d\n", X);
            }
            X++;
        }
    }
    return 0;
}