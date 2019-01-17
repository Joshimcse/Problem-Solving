#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main() {
    int n;
    cin >> n;

    printf("VOLUME = %.3f\n", (4.0 / 3.0) * 3.14159 * pow(n, 3));

    return 0;
}