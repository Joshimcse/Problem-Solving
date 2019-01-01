#include <stdio.h>
int main() {
    int i, j, sort[3], sort1[3], temp;
    for (i = 0; i < 3; i++) {
        scanf("%d", &sort[i]);
    }

    for (i = 0; i < 3; i++) {
        sort1[i] = sort[i];
    }

    for (i = 0; i < 3; i++) {
        for (j = i + 1; j < 3; j++) {
            if (sort1[i] > sort1[j]) {
                temp = sort1[i];
                sort1[i] = sort1[j];
                sort1[j] = temp;
            }
        }
    }
    
    for (i = 0; i < 3; i++) {
        printf("%d\n", sort1[i]);
    }
    printf("\n");

    for (i = 0; i < 3; i++) {
        printf("%d\n", sort[i]);
    }

    return 0;
}