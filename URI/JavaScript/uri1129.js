const input = require('fs').readFileSync('./dev/stdin', 'utf8');
const lines = input.split('\n');

while (true) {
    let n = parseInt(lines.shift());
    if (n === '' || isNaN(n) || n === undefined || n === null) break;

    while (n != 0) {
        const val = lines.shift().split(' ');
        
        let white = 0;
        let black = 0;
        let firstWhite = 0;
        let firstBlack = 0;

        for (let i = 0; i < 5; i++) {
            if (parseInt(val[i]) > 127) {
                white++;
                if (white === 1) {
                    firstWhite = i;
                }
            } else {
                black++
                if (black === 1) {
                    firstBlack = i;
                }
            }
        }

        if (black === 1) {
            switch (firstBlack) {
                case 0:
                    console.log('A');
                    break;
                case 1:
                    console.log('B');
                    break;
                case 2:
                    console.log('C');
                    break;
                case 3:
                    console.log('D');
                    break;
                case 4:
                    console.log('E');
                    break;
            }
        } else {
            console.log('*');
        }

        n--;
    }
}