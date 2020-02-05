#include <stdio.h>

int main() {
    char name;
    float salary, sold;

    scanf("%s", &name);
    scanf("%f", &salary);
    scanf("%f", &sold);

    float total = sold / 100 * 15 + salary;

    printf("TOTAL = R$ %.2f\n", total);

    return 0;
}