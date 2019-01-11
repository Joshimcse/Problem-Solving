#include <stdio.h>
int main() {
    int N, x, y, sum, j, i = 1;
    scanf("%d", &N);

    while(i <= N) {
        sum = 0;
        scanf("%d %d", &x, &y);
        if(x < y) {
            j = x + 1;
            while(j < y) {
                if(j % 2 == 1) {
                    sum += j;
                }
                j++;
            }
        } else {
            j = y+1;
            while(j < x) {
                if(j % 2 == 1) {
                    sum += j;
                }
                j++;
            }
        }
        printf("%d\n", sum);
        i++;
    }
    return 0;
}
