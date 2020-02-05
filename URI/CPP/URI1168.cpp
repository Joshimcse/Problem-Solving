#include <iostream>

using namespace std;

int main() {
    int i, n;
    char num[100];

    cin >> n;
    
    for (i = 0; i < n; i++) {
        cin >> num;
        int leds = 0, j = 0;
        while (num[j] != '\0') {
            if (num[j] == '1')
                leds += 2;
            else if (num[j] == '2')
                leds += 5;
            else if (num[j] == '3')
                leds += 5;
            else if (num[j] == '4')
                leds += 4;
            else if (num[j] == '5')
                leds += 5;
            else if (num[j] == '6')
                leds += 6;
            else if (num[j] == '7')
                leds += 3;
            else if (num[j] == '8')
                leds += 7;
            else if (num[j] == '9')
                leds += 6;
            else if (num[j] == '0')
                leds += 6;
            j++;
        }
        cout << leds << " leds\n";
    }
    return 0;
}