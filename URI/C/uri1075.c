#include <stdio.h>
int main() {
    int N, i = 2;
    scanf("%d", &N);

    if (N > i) {
        while (i < 10000) {
            printf("%d\n", i);
            i += N;
        }
    }
    return 0;
}