#include <stdio.h>
int main() {
    int time, av_speed;
    //  using this car that does 12 Km/L
    float fuel = 12;

    scanf("%d", &time);
    scanf("%d", &av_speed);

    float total = (time * av_speed) / fuel;

    printf("%.3f\n", total);

    return 0;
}