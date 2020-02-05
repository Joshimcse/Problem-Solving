#include <stdio.h>
int main() {
    int X, Y;
    float total;
    scanf("%d %d", &X, &Y);

    switch (X) {
    case 1:
        total = 4.00 * Y;
        printf("Total: R$ %.2f\n", total);
        break;
    case 2:
        total = 4.50 * Y;
        printf("Total: R$ %.2f\n", total);
        break;
    case 3:
        total = 5.00 * Y;
        printf("Total: R$ %.2f\n", total);
        break;
    case 4:
        total = 2.00 * Y;
        printf("Total: R$ %.2f\n", total);
        break;
    case 5:
        total = 1.50 * Y;
        printf("Total: R$ %.2f\n", total);
        break;
    }
    
    return 0;
}