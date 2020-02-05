#include <stdio.h>
int main() {
    int N, i = 0;
    scanf("%d", &N);
    int num[N];

    while (i < N) {
        scanf("%d", &num[i]);
        i++;
    }

    for (i = 0; i < N; i++) {
        if (num[i] > 0 && num[i] % 2 == 0) {
            printf("EVEN POSITIVE\n");
        } else if (num[i] > 0 && num[i] % 2 == 1) {
            printf("ODD POSITIVE\n");
        } else if (num[i] < 0 && num[i] % 2 == 0) {
            printf("EVEN NEGATIVE\n");
        } else if (num[i] < 0 && num[i] % 2 == -1) {
            printf("ODD NEGATIVE\n");
        } else {
            printf("NULL\n");
        }
    }
    return 0;
}