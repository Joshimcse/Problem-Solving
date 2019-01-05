#include <stdio.h>
int main() {
    float num[6], sum = 0;
    int i = 0, count = 0;

    while (i < 6) {
        scanf("%f", &num[i]);
        if (num[i] > 0) {
            count++;
            sum += num[i];
        }
        i++;
    }
    printf("%d valores positivos\n", count);
    printf("%.1f\n", sum / count);

    return 0;
}