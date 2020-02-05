#include <stdio.h>
int main() {
    int st, sm, et, em, rt, rm;
    scanf("%d %d %d %d", &st, &sm, &et, &em);

    rt = et - st;
    if (rt < 0) {
        rt = 24 - st + et;
    }

    rm = em - sm;
    if (rm < 0) {
        rm = 60 - sm + em;
        rt--;
    }

    if (st == et && sm == em) {
        printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    } else {
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", rt, rm);
    }

    return 0;
}