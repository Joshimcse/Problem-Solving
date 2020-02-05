#include <stdio.h>
int main() {
    int i = 0, count = 0, value[5];

    while (i < 5) {
        scanf("%d", &value[i]);
        if (value[i] % 2 == 0) {
            count++;
        }
        i++;
    }
    printf("%d valores pares\n", count);

    return 0;
}