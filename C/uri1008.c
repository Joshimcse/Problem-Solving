#include <stdio.h>

int main() {
    int Num, Hour;
    float Rate;

    scanf("%d",&Num);
    scanf("%d",&Hour);
    scanf("%f",&Rate);

    float Salary = Hour * Rate;

    printf("NUMBER = %d\n", Num);
    printf("SALARY = U$ %.2f\n", Salary);

    return 0;
}
