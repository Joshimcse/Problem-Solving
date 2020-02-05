#include <stdio.h>
int main() {
    int N, i = 1;
    scanf("%d", &N);
    
    if (N > 5) {
        while (N >= i) {
            if (i % 2 == 0) {
                printf("%d^2 = %d\n", i, i * i);
            }
            i++;
        }
    }
    return 0;
}