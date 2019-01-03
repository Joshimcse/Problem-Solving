#include <stdio.h>
int main() {
    float salary;
    int p;

    scanf("%f", &salary);
    if (salary >= 0 && salary <= 400) {
        p = 15.00;
    } else if (salary >= 400.01 && salary <= 800.00) {
        p = 12.00;
    } else if (salary >= 800.01 && salary <= 1200.00) {
        p = 10.00;
    } else if (salary >= 1200.01 && salary <= 2000.00) {
        p = 7.00;
    } else if (salary > 2000.00) {
        p = 4.00;
    }

    printf("Novo salario: %.2f\n", salary + ((salary / 100) * p));
    printf("Reajuste ganho: %.2f\n", (salary / 100) * p);
    printf("Em percentual: %d %c\n", p, '%');

    return 0;
}