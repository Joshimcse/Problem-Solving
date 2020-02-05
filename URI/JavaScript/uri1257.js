let input = require('fs').readFileSync('./dev/stdin', 'utf8');
let lines = input.split('\n');

let alphabet = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];

let n = parseInt(lines.shift());
while (n--) {
    let arrayHash = 0,
        linesCounts = 0;
    let numberOfLines = parseInt(lines.shift());
    while (numberOfLines--) {
        let strOfLine = lines.shift().trim();
        for (i = 0; i < strOfLine.length; i++) {
            arrayHash += alphabet.indexOf(strOfLine[i]) + linesCounts + i;
        }
        linesCounts++;
    }
    console.log(arrayHash);
}