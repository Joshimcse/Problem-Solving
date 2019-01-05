#include <stdio.h>
int main() {

    for (int even = 1; even <= 100; even++) {
        if (even % 2 == 0) {
            printf("%d\n", even);
        }
    }
    return 0;
}
