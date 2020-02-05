#include <stdio.h>
int main() {
    int N, i, j;
    scanf("%d", &N);

    for (i = 0; i < N; i++) {
        for (j = (i * 4) + 1; j <= (i * 4) + 3; j++) {
            printf("%d ", j);
        }
        printf("PUM\n");
    }
    return 0;
}