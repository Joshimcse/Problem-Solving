let input = require('fs').readFileSync('./dev/stdin', 'utf8');
let lines = input.split('\n');

let numberOfTestCases = parseInt(lines.shift());
while (numberOfTestCases--) {
    let qt = lines.shift().split(' ');
    let guessedNumber = lines.shift().split(' ');

    let amountOfStd = parseInt(qt.shift());
    let secretNumebr = parseInt(qt.shift());
    let winner = 1, diff = Number.POSITIVE_INFINITY;

    for (i = 0; i < amountOfStd; i++) {
        if(parseInt(guessedNumber[i]) === secretNumebr) {
            winner = i + 1;
            break;
        } else {
            if(Math.abs(secretNumebr - parseInt(guessedNumber[i])) < diff) {
                winner = i + 1;
                diff = Math.abs(secretNumebr - parseInt(guessedNumber[i]))
            } 
        }
    }
    console.log(winner);
}