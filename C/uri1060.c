#include <stdio.h>
int main() {
    float num[6];
    int i = 0, count = 0;

    while (i < 6) {
        scanf("%f", &num[i]);
        if (num[i] > 0) {
            count++;
        }
        i++;
    }
    printf("%d valores positivos\n", count);

    return 0;
}