#include <stdio.h>
int main() {
    int x, y;
    while ((scanf("%d %d", &x, &y) == 2) && (x != y)) {
        if (x < y) {
            printf("Crescente\n");
        } else {
            printf("Decrescente\n");
        }
    }
    return 0;
}